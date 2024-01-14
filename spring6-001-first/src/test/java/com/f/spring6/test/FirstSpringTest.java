package com.f.spring6.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fzy
 * @date 2024/1/14 13:59
 */
public class FirstSpringTest {
    @Test
    public void testSpringFirstCode() {
        // 1.获取Spring容器对象
        // ApplicationContext 翻译为：应用上下文。其实就是Spring容器。
        // ApplicationContext 是一个接口。
        // ApplicationContext 接口下有很多实现类。其中有一个实现类叫做：ClassPathXmlApplicationContext
        // ClassPathXmlApplicationContext 是专门用于从类路径当中加载spring配置文件的一个Spring上下文对象。
        // 这行代码只要执行，就相当于启动了Spring容器，同时会解析spring.xml（Spring配置文件名）文件，
        // 并且实例化在Spring配置文件中配置的所有的bean对象，创建完成对象后会将其放到spring容器当中。
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        // 2.根据bean的id从Spring容器中获取这个对象
        Object userBean = applicationContext.getBean("userBean");
        System.out.println(userBean);
    }

    @Test
    public void testLog4j2() {
        // 获取日志记录器对象（记录日志需要一个日志记录器）
        // 获取FirstSpringTest类的日志记录器对象，只要是FirstSpringTest类中的代码执行记录日志的话，就输出相关的日志信息。
        Logger logger = LoggerFactory.getLogger(com.f.spring6.test.FirstSpringTest.class);

        // 记录日志，记录不同的级别的日志
        // 输出日志时，根据配置文件中设置的输出日志级别进行输出
        logger.trace("我是一条查找追踪信息");
        logger.debug("我是一条调试信息");
        logger.info("我是一条消息");
        logger.error("我是一条错误信息");
    }
}
