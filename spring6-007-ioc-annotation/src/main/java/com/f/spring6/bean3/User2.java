package com.f.spring6.bean3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author fzy
 * @date 2024/1/24 12:56
 */
@Component
public class User2 {
    private String name;
    private int age;

    // @Value注解也可以使用在方法上
    @Value("张三")
    public void setName(String name) {
        this.name = name;
    }

    @Value("10")
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
