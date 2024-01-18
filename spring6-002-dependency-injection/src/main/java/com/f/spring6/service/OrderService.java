package com.f.spring6.service;

import com.f.spring6.dao.OrderDao;

/**
 * @author fzy
 * @date 2024/1/17 16:05
 */
public class OrderService {
    private OrderDao orderDao;

    // 通过set方法给属性赋值
    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void generate() {
        this.orderDao.generate();
    }
}
