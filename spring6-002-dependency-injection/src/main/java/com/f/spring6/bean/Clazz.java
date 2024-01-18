package com.f.spring6.bean;

/**
 * @author fzy
 * @date 2024/1/17 19:38
 */
public class Clazz {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "name='" + name + '\'' +
                '}';
    }
}
