package com.f.factory.method;

/**
 * 抽象工厂角色
 *
 * @author fzy
 * @date 2024/1/20 15:58
 */
public abstract class WeaponFactory {
    /**
     * 这个方法不是静态的，是实例方法
     *
     * @return
     */
    public abstract Weapon getWeapon();
}
