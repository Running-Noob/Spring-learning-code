package com.f.spring6.test;

import com.f.spring6.service.Spring6Config;
import com.f.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fzy
 * @date 2024/1/25 15:17
 */
public class SpringAOPTest {
    @Test
    public void testNoXML() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.login();
    }
    @Test
    public void testAdvice() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.login();
    }
}