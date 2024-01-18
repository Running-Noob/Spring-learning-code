package com.f.spring6.test;

import com.f.spring6.bean.*;
import com.f.spring6.bean.Math;
import com.f.spring6.jdbc.MyDataSource;
import com.f.spring6.jdbc.MyDataSource1;
import com.f.spring6.jdbc.MyDataSource2;
import com.f.spring6.service.OrderService;
import com.f.spring6.service.UserService;
import com.f.spring6.service.UserService2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fzy
 * @date 2024/1/17 14:42
 */
public class SpringDITest {
    @Test
    public void testProperties() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-properties.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
    }

    @Test
    public void testAutoWire() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        OrderService orderServiceBean = applicationContext.getBean("orderServiceBean", OrderService.class);
        orderServiceBean.generate();
    }

    @Test
    public void testUtil() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-util.xml");
        MyDataSource1 myDataSource1 = applicationContext.getBean("myDataSource1", MyDataSource1.class);
        MyDataSource2 myDataSource2 = applicationContext.getBean("myDataSource2", MyDataSource2.class);
        System.out.println(myDataSource1);
        System.out.println(myDataSource2);
    }

    @Test
    public void testC() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-c.xml");
        Bird birdBean = applicationContext.getBean("birdBean", Bird.class);
        System.out.println(birdBean);
    }

    @Test
    public void testP() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-p.xml");
        Dog dogBean = applicationContext.getBean("dogBean", Dog.class);
        System.out.println(dogBean);
    }

    @Test
    public void testSpecial() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Object mathBean = applicationContext.getBean("mathBean", Math.class);
        System.out.println(mathBean);
    }

    @Test
    public void testNullDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Cat catBean = applicationContext.getBean("catBean", Cat.class);
        System.out.println(catBean);
    }

    @Test
    public void testPropertiesDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collection.xml");
        DataSourceProperties dataSourcePropertiesBean = applicationContext.getBean("dataSourcePropertiesBean", DataSourceProperties.class);
        System.out.println(dataSourcePropertiesBean);
    }

    @Test
    public void testMapDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collection.xml");
        School schoolBean = applicationContext.getBean("schoolBean", School.class);
        System.out.println(schoolBean);
    }

    @Test
    public void testListAndSetDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collection.xml");
        People peopleBean = applicationContext.getBean("peopleBean", People.class);
        System.out.println(peopleBean);
    }

    @Test
    public void testArrayDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Person personBean = applicationContext.getBean("personBean", Person.class);
        System.out.println(personBean);
    }

    @Test
    public void testCascade() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cascade.xml");
        Student studentBean = applicationContext.getBean("studentBean", Student.class);
        System.out.println(studentBean);
    }

    @Test
    public void testMyDataSourceDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        MyDataSource myDataSourceBean = applicationContext.getBean("myDataSourceBean", MyDataSource.class);
        System.out.println(myDataSourceBean);
    }

    @Test
    public void testSetDI3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);
    }

    @Test
    public void testSetDI2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        OrderService orderServiceBean = applicationContext.getBean("orderServiceBean", OrderService.class);
        System.out.println(orderServiceBean);
        orderServiceBean.generate();
    }

    @Test
    public void testConstructorDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        UserService2 userService2Bean = applicationContext.getBean("userService2Bean", UserService2.class);
        userService2Bean.saveUser();
    }

    @Test
    public void testSetDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userServiceBean = applicationContext.getBean("userServiceBean", UserService.class);
        userServiceBean.saveUser();
    }
}
