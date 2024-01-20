package com.f.factory.method;

/**
 * 具体工厂角色
 *
 * @author fzy
 * @date 2024/1/20 16:00
 */
public class FighterFactory extends WeaponFactory {
    @Override
    public Weapon getWeapon() {
        return new Fighter();
    }
}
