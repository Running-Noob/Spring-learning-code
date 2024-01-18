package com.f.spring6.test;

import com.f.spring6.bean.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fzy
 * @date 2024/1/18 16:17
 */
public class SpringBeanScopeTest {
    @Test
    public void testBeanScope() {
        // Spring 上下文初始化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean springBean1 = applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(springBean1);
        SpringBean springBean2 = applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(springBean2);
        SpringBean springBean3 = applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(springBean3);
    }
}
