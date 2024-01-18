package com.f.spring6.bean;

import java.util.Date;

/**
 * @author fzy
 * @date 2024/1/17 22:09
 */
public class Dog {
    private String name;
    private int age;
    private Date birth;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                '}';
    }
}
