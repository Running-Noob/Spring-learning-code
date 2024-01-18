package com.f.spring6.bean;

/**
 * @author fzy
 * @date 2024/1/18 10:34
 */
public class Bird {
    private String name;
    private String color;

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
