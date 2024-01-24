package com.f.proxy.service;

/**
 * 订单业务接口
 *
 * @author fzy
 * @date 2024/1/24 19:10
 */
public interface OrderService { // 代理对象和目标对象的公共接口

    // 生成订单
    void generate();

    // 修改订单
    void modify();

    // 查看订单详情
    void detail();
}
