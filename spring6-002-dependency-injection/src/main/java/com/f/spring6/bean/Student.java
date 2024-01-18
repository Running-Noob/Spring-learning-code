package com.f.spring6.bean;

/**
 * @author fzy
 * @date 2024/1/17 19:39
 */
public class Student {
    private String name;
    // 学生属于哪个班级
    private Clazz clazz;

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
