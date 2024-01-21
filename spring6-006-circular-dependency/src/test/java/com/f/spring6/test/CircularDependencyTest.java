package com.f.spring6.test;

import com.f.spring6.bean.Husband;
import com.f.spring6.bean.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fzy
 * @date 2024/1/21 16:05
 */
public class CircularDependencyTest {
    @Test
    public void testCD2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");
        Husband husband = applicationContext.getBean("husband", Husband.class);
        System.out.println(husband);
        Wife wife = applicationContext.getBean("wife", Wife.class);
        System.out.println(wife);
    }

    @Test
    public void testCD() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Husband husband = applicationContext.getBean("husband", Husband.class);
        System.out.println(husband);
        Wife wife = applicationContext.getBean("wife", Wife.class);
        System.out.println(wife);
    }
}