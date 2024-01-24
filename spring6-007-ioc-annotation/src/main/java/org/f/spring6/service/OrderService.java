package org.f.spring6.service;

import org.f.spring6.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author fzy
 * @date 2024/1/24 13:13
 */
@Service
public class OrderService {
    // @Autowired注解使用的时候，不需要指定任何属性，直接使用这个注解即可。
    // 这个注解的作用是根据类型byType进行自动装配
    @Autowired
    // @Autowired和@Qualifier联合使用，可以根据名字进行自动装配
    @Qualifier("orderDaoImplForMysql")
    private OrderDao orderDao;

    public void generate() {
        orderDao.insert();
    }
}
