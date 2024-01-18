package com.f.spring6.bean;

/**
 * @author fzy
 * @date 2024/1/17 21:56
 */
public class Math {
    private String result;

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Math{" +
                "result='" + result + '\'' +
                '}';
    }
}
