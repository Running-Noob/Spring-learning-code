package org.myspringframework.core;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fzy
 * @date 2024/1/21 20:48
 */
public class ClassPathXmlApplicationContext implements ApplicationContext {
    // 缓存。用于存放Bean对象的map集合，使用Bean的名称可以获取相应的Bean对象
    private Map<String, Object> singletonObjects = new HashMap<>();

    /**
     * 解析myspring的配置文件，并初始化所有的Bean对象
     * 解析myspring.xml文件，然后实例化Bean，将Bean存放到singletonObjects集合当中
     *
     * @param configLocation spring配置文件的路径
     */
    public ClassPathXmlApplicationContext(String configLocation) {
        try {
            // 这是dom4j解析XML文件的核心对象
            SAXReader saxReader = new SAXReader();
            InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream(configLocation);
            // 读文件
            Document document = saxReader.read(in);
            // 获取所有的bean标签
            List<Node> nodes = document.selectNodes("//bean");
            // 遍历bean标签，这次是实例化Bean，并加入Map集合
            nodes.forEach(node -> {
                try {
                    // 向下转型的目的是为了使用Element接口里面更加丰富的方法
                    Element beanElt = (Element) node;
                    String id = beanElt.attributeValue("id");
                    String className = beanElt.attributeValue("class");
                    // 通过反射机制创建对象，将其放到Map集合中，提前曝光
                    // 获取Class
                    Class<?> clazz = Class.forName(className);
                    // 获取无参数构造方法
                    Constructor<?> defaultCons = clazz.getDeclaredConstructor();
                    // 调用无参数构造方法实例化Bean
                    Object bean = defaultCons.newInstance();
                    // 将Bean曝光，加入Map集合
                    singletonObjects.put(id, bean);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            // 再次把所有的bean标签遍历一次，这次主要是给对象的属性赋值
            nodes.forEach(node -> {
                try {
                    Element beanElt = (Element) node;
                    String id = beanElt.attributeValue("id");
                    String className = beanElt.attributeValue("class");
                    // 获取Class
                    Class<?> clazz = Class.forName(className);
                    // 获取该bean标签下所有属性的property标签
                    List<Element> propertyElts = beanElt.elements("property");
                    // 遍历所有的property标签
                    propertyElts.forEach(propertyElt -> {
                        try {
                            // 获取属性名
                            String propertyName = propertyElt.attributeValue("name");
                            // 获取set方法名
                            String setMethodName = "set" + propertyName.toUpperCase().charAt(0) + propertyName.substring(1);
                            // 获取属性
                            Field field = clazz.getDeclaredField(propertyName);
                            // 获取set方法
                            Method setMethod = clazz.getDeclaredMethod(setMethodName, field.getType());
                            // 获取具体的值
                            String value = propertyElt.attributeValue("value");
                            Object actualVal = null;
                            String ref = propertyElt.attributeValue("ref");
                            if (value != null) {    // 说明这个值是简单类型
                                // 获取属性类型名
                                String propertyTypeSimpleName = field.getType().getSimpleName();
                                switch (propertyTypeSimpleName) {
                                    case "byte":
                                        actualVal = Byte.parseByte(value);
                                        break;
                                    case "short":
                                        actualVal = Short.parseShort(value);
                                        break;
                                    case "int":
                                        actualVal = Integer.parseInt(value);
                                        break;
                                    case "long":
                                        actualVal = Long.parseLong(value);
                                        break;
                                    case "float":
                                        actualVal = Float.parseFloat(value);
                                        break;
                                    case "double":
                                        actualVal = Double.parseDouble(value);
                                        break;
                                    case "boolean":
                                        actualVal = Boolean.parseBoolean(value);
                                        break;
                                    case "char":
                                        actualVal = value.charAt(0);
                                        break;
                                    case "Byte":
                                        actualVal = Byte.valueOf(value);
                                        break;
                                    case "Short":
                                        actualVal = Short.valueOf(value);
                                        break;
                                    case "Integer":
                                        actualVal = Integer.valueOf(value);
                                        break;
                                    case "Long":
                                        actualVal = Long.valueOf(value);
                                        break;
                                    case "Float":
                                        actualVal = Float.valueOf(value);
                                        break;
                                    case "Double":
                                        actualVal = Double.valueOf(value);
                                        break;
                                    case "Boolean":
                                        actualVal = Boolean.valueOf(value);
                                        break;
                                    case "Character":
                                        actualVal = Character.valueOf(value.charAt(0));
                                        break;
                                    case "String":
                                        actualVal = value;
                                }
                                // 调用set方法(set方法没有返回值)
                                setMethod.invoke(singletonObjects.get(id), actualVal);
                            }
                            if (ref != null) {  // 说明这个值是非简单类型
                                // 调用set方法(set方法没有返回值)
                                setMethod.invoke(singletonObjects.get(id), singletonObjects.get(ref));
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String beanName) {
        return singletonObjects.get(beanName);
    }
}
