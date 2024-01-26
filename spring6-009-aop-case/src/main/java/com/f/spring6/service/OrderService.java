package com.f.spring6.service;

import org.springframework.stereotype.Service;

/**
 * @author fzy
 * @date 2024/1/26 10:57
 */
@Service
public class OrderService { // 目标对象
    // 目标方法
    // 生成订单的业务方法
    public void generate() {
        System.out.println("正在生成订单...");
    }

    // 目标方法
    // 取消订单的业务方法
    public void cancel() {
        System.out.println("正在取消订单...");
    }
}
