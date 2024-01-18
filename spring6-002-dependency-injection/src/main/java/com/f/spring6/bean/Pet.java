package com.f.spring6.bean;

/**
 * @author fzy
 * @date 2024/1/17 20:02
 */
public class Pet {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
