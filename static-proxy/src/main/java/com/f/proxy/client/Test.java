package com.f.proxy.client;

import com.f.proxy.service.OrderService;
import com.f.proxy.service.OrderServiceImpl;
import com.f.proxy.service.OrderServiceProxy;

/**
 * @author fzy
 * @date 2024/1/24 19:15
 */
public class Test {
    public static void main(String[] args) {
        // 创建目标对象
        OrderService target = new OrderServiceImpl();
        // 创建代理对象
        OrderService proxy = new OrderServiceProxy(target);
        // 调用代理对象的代理方法
        proxy.generate();
        proxy.modify();
        proxy.detail();
    }
}
