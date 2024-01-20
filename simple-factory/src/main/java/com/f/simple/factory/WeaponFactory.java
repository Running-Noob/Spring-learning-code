package com.f.simple.factory;

/**
 * 工厂类角色
 *
 * @author fzy
 * @date 2024/1/20 15:38
 */
public class WeaponFactory {
    /**
     * 静态方法。
     * 要获取什么产品，就看你传什么参数，传TANK获取坦克，传FIGHTER获取战斗机
     * 简单工厂模式中有一个静态方法，所以称为：静态工厂方法模式
     *
     * @param weaponType
     * @return
     */
    public static Weapon getWeapon(String weaponType) {
        if ("TANK".equals(weaponType)) {
            return new Tank();
        }
        if ("FIGHTER".equals(weaponType)) {
            return new Fighter();
        }
        throw new RuntimeException("不支持该武器的生产");
    }
}
