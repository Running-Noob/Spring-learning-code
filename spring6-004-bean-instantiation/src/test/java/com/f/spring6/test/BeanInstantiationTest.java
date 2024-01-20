package com.f.spring6.test;

import com.f.spring6.bean.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fzy
 * @date 2024/1/20 16:42
 */
public class BeanInstantiationTest {
    @Test
    public void testInstantiation5() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
    }

    @Test
    public void testInstantiation4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }

    @Test
    public void testInstantiation3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Apple apple = applicationContext.getBean("apple", Apple.class);
        apple.taste();
    }

    @Test
    public void testInstantiation2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Star star = applicationContext.getBean("star", Star.class);
        System.out.println(star);
    }

    @Test
    public void testInstantiation1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        SpringBean springBean = applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(springBean);
    }
}
