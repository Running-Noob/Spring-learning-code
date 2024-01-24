package com.f.spring6.test;

import cn.f.spring6.Spring6Config;
import cn.f.spring6.service.StudentService;
import com.f.spring6.bean.User;
import com.f.spring6.bean3.MyDataSource;
import com.f.spring6.bean3.Product;
import com.f.spring6.bean3.User2;
import com.f.spring6.dao.OrderDao;
import org.f.spring6.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fzy
 * @date 2024/1/22 14:01
 */
public class IoCAnnotationTest {
    @Test
    public void testConfigClass() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
        studentService.deleteStudent();
    }

    @Test
    public void testResource() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-resource.xml");
        StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
        studentService.deleteStudent();
    }

    @Test
    public void testAutowired() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowired.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }

    @Test
    public void testDIByAnnotation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di-annotation.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
        User2 user2 = applicationContext.getBean("user2", User2.class);
        System.out.println(user2);
        Product product = applicationContext.getBean("product", Product.class);
        System.out.println(product);
    }

    @Test
    public void testChoose() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-choose.xml");
    }

    @Test
    public void testBeanComponent() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
        OrderDao orderDao = applicationContext.getBean("orderDao", OrderDao.class);
        System.out.println(orderDao);
    }
}