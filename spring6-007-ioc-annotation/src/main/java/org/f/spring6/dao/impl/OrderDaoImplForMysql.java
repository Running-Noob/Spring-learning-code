package org.f.spring6.dao.impl;

import org.f.spring6.dao.OrderDao;
import org.springframework.stereotype.Repository;

/**
 * @author fzy
 * @date 2024/1/24 13:12
 */
@Repository
public class OrderDaoImplForMysql implements OrderDao {
    @Override
    public void insert() {
        System.out.println("Mysql数据库正在保存订单信息...");
    }
}
