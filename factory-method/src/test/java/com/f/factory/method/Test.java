package com.f.factory.method;

/**
 * 这是客户端程序
 *
 * @author fzy
 * @date 2024/1/20 16:01
 */
public class Test {
    public static void main(String[] args) {
        // 需要坦克
        TankFactory tankFactory = new TankFactory();
        Weapon tank = tankFactory.getWeapon();
        tank.attack();
        // 需要战斗机
        FighterFactory fighterFactory = new FighterFactory();
        Weapon fighter = fighterFactory.getWeapon();
        fighter.attack();
    }
}
