package com.f.factory.method;

/**
 * 具体产品角色
 *
 * @author fzy
 * @date 2024/1/20 15:36
 */
public class Tank extends Weapon {
    @Override
    public void attack() {
        System.out.println("坦克开炮");
    }
}
