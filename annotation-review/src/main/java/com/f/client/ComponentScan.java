package com.f.client;

import com.f.annotation.Component;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fzy
 * @date 2024/1/22 13:15
 */
public class ComponentScan {
    public static void main(String[] args) {
        Map<String, Object> singletonObjects = new HashMap<>();
        // 目前只知道一个包的名字，扫描这个包下所有的类。
        // 当这个类上有@Component注解的时候，实例化该对象，然后放到Map集合中。
        String packageName = "com.f.bean";
        String packagePath = packageName.replaceAll("\\.", "/");
        // com是在类的根路径下的一个目录
        URL url = ClassLoader.getSystemClassLoader().getResource(packagePath);
        // 获取绝对路径
        String path = url.getPath();
        path = URLDecoder.decode(path, StandardCharsets.UTF_8); // 对获取到的URL进行解码
        // 获取绝对路径下的所有文件
        File file = new File(path);
        File[] files = file.listFiles();
        Arrays.stream(files).forEach(f -> {
            try {
                // 得到指定包下所有类的全限定类名
                String className = packageName + "." + f.getName().split("\\.")[0];
                // 通过反射机制解析注解
                Class<?> clazz = Class.forName(className);
                if (clazz.isAnnotationPresent(Component.class)) {
                    // 获取类上的注解
                    Component annotation = clazz.getAnnotation(Component.class);
                    String id = annotation.value();
                    Object obj = clazz.newInstance();
                    // 实例化对象，将其放到Map集合中
                    singletonObjects.put(id, obj);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        System.out.println(singletonObjects);
    }
}
