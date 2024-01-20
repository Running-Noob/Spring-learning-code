package com.f.spring6.bean;

import java.util.Date;

/**
 * @author fzy
 * @date 2024/1/20 21:44
 */
public class Student {
    private Date birth;

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "birth=" + birth +
                '}';
    }
}
