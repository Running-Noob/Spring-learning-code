package com.f.spring6.bean;

/**
 * 简单工厂模式中的工厂类角色
 *
 * @author fzy
 * @date 2024/1/20 16:46
 */
public class StarFactory {
    // 静态方法
    public static Star get() {
        // 实际上这个Star对象最终创建的时候还是我们负责new的。
        return new Star();
    }
}
