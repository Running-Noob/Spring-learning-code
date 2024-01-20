package com.f.simple.factory;

/**
 * 具体产品角色
 *
 * @author fzy
 * @date 2024/1/20 15:37
 */
public class Fighter extends Weapon {
    @Override
    public void attack() {
        System.out.println("战斗机开火");
    }
}
