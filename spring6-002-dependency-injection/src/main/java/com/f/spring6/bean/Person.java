package com.f.spring6.bean;

import java.util.Arrays;

/**
 * @author fzy
 * @date 2024/1/17 19:55
 */
public class Person {
    private String[] hobbies;
    private Pet[] pets;

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Person{" +
                "hobbies=" + Arrays.toString(hobbies) +
                ", pets=" + Arrays.toString(pets) +
                '}';
    }
}
