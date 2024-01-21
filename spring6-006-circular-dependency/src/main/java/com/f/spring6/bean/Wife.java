package com.f.spring6.bean;

/**
 * @author fzy
 * @date 2024/1/21 16:00
 */
public class Wife {
    private String name;
    private Husband husband;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", husband=" + husband.getName() +
                '}';
    }
}
