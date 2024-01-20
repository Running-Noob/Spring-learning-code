package com.f.spring6.bean;

/**
 * 工厂方法模式中的：具体工厂角色
 *
 * @author fzy
 * @date 2024/1/20 21:02
 */
public class AppleFactory extends FruitFactory {
    @Override
    public Fruit getFruit() {
        // 实际上这个对象还是我们自己new的，不是Spring容器帮我们创建的
        return new Apple();
    }
}
