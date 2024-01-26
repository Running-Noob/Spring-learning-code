package com.f.spring6.test;

import com.f.spring6.biz.UserService;
import com.f.spring6.biz.VipService;
import com.f.spring6.service.AccountService;
import com.f.spring6.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fzy
 * @date 2024/1/26 11:06
 */
public class AopCaseTest {
    @Test
    public void testSercurityLog() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.saveUser();
        userService.deleteUser();
        userService.modifyUser();
        userService.getUser();
        VipService vipService = applicationContext.getBean("vipService", VipService.class);
        vipService.saveVip();
        vipService.deleteVip();
        vipService.modifyVip();
        vipService.getVip();
    }

    @Test
    public void testTransaction() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.transfer();
        accountService.withdraw();
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
        orderService.cancel();
    }
}