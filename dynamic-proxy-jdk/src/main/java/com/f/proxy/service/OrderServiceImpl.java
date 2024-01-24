package com.f.proxy.service;

/**
 * @author fzy
 * @date 2024/1/24 19:12
 */
public class OrderServiceImpl implements OrderService { // 目标对象
    @Override
    public void generate() {    // 目标方法
        System.out.println("订单已生成...");
    }

    @Override
    public void modify() {  // 目标方法
        System.out.println("订单已修改...");
    }

    @Override
    public void detail() {  // 目标方法
        System.out.println("查看订单详情...");
    }
}
