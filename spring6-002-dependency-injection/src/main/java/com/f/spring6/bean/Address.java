package com.f.spring6.bean;

/**
 * @author fzy
 * @date 2024/1/17 20:15
 */
public class Address {
    private String location;

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "location='" + location + '\'' +
                '}';
    }
}
