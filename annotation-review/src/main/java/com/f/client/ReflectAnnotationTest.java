package com.f.client;

import com.f.annotation.Component;

/**
 * 通过反射机制读取注解
 *
 * @author fzy
 * @date 2024/1/22 13:03
 */
public class ReflectAnnotationTest {
    public static void main(String[] args) throws Exception {
        // 获取类
        Class<?> clazz = Class.forName("com.f.bean.User");
        // 判断这个类上有没有这个注解
        if (clazz.isAnnotationPresent(Component.class)) {
            // 获取这个注解
            Component annotation = clazz.getAnnotation(Component.class);
            // 访问注解属性
            String value = annotation.value();
            //String[] names = annotation.names();
            System.out.println(value);
            //for (String name : names) {
            //    System.out.println(name);
            //}
        }
    }
}
