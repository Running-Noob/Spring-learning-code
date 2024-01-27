package com.f.spring6.test;

import com.f.spring6.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author fzy
 * @date 2024/1/27 13:57
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")   // classpath表示从类的根路径开始加载
// 在单元测试类中使用上面这两个注解之后，在单元测试类中的属性上可以使用@Autowired进行注入，比较方便
public class SpringJunit4Test {
    @Autowired
    private User user;

    @Test
    public void testUser() {
        // ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        // User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }
}
