package com.f.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 *
 * @author fzy
 * @date 2024/1/22 12:33
 */
// @Target注解用来修饰@Component可以出现的位置
// 以下表示Component注解可以出现在类上、属性上
//@Target(value = {ElementType.TYPE, ElementType.FIELD})
// 使用某个注解的时候，如果注解的属性名是value的话，value可以省略
//@Target({ElementType.TYPE, ElementType.FIELD})
// 使用某个注解的时候，如果注解的属性值是数组，并且数组中只有一个元素，那么大括号可以省略
@Target(ElementType.TYPE)
// @Retention也是一个元注解。用来标注@Component注解最终保留到到什么时候。
// 以下表示Component注解最终保留在class文件当中，并且可以被反射机制读取。
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
    // 定义注解的属性

    // String是属性类型
    // value是属性名字
    String value();

    // String[]是属性类型
    // names是属性名字
    //String[] names();
}