package com.f.spring6.bean;

/**
 * 工厂方法模式中的：具体产品角色
 *
 * @author fzy
 * @date 2024/1/20 21:01
 */
public class Apple extends Fruit {
    @Override
    public void taste() {
        System.out.println("苹果尝起来是甜的");
    }
}
