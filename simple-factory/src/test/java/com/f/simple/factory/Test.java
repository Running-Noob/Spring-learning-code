package com.f.simple.factory;

/**
 * 这是客户端程序
 *
 * @author fzy
 * @date 2024/1/20 15:42
 */
public class Test {
    public static void main(String[] args) {
        // 需要坦克
        Weapon tank = WeaponFactory.getWeapon("TANK");
        tank.attack();
        // 需要战斗机
        Weapon fighter = WeaponFactory.getWeapon("FIGHTER");
        fighter.attack();
    }
}
