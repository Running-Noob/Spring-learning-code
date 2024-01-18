package com.f.spring6.bean;

import java.util.Map;

/**
 * @author fzy
 * @date 2024/1/17 20:26
 */
public class School {
    private Map<Clazz, Student> school;

    public void setSchool(Map<Clazz, Student> school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "School{" +
                "school=" + school +
                '}';
    }
}
