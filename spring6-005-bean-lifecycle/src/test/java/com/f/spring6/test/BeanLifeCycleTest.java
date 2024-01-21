package com.f.spring6.test;

import com.f.spring6.bean.Student;
import com.f.spring6.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fzy
 * @date 2024/1/21 12:51
 */
public class BeanLifeCycleTest {
    @Test
    public void testRegisterBean() {
        // 自己new的对象
        Student student = new Student();
        System.out.println("纳入Spring管理前的Student对象：" + student);
        // 将以上自己new的对象纳入Spring容器来管理
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerSingleton("studentBean", student);
        // 从Spring容器中获取
        Student studentBean = factory.getBean("studentBean", Student.class);
        System.out.println("纳入Spring管理后的StudentBean：" + studentBean);
    }

    @Test
    public void testBeanLifeCycleFive() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println("第四步：使用Bean：" + user);
        // 注意：必须手动关闭Spring容器，这样Spring容器才会销毁Bean
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }
}
