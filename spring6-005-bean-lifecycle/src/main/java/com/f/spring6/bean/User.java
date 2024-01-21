package com.f.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @author fzy
 * @date 2024/1/21 12:47
 */
public class User implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {
    private String name;

    public User() {
        System.out.println("第一步：无参数构造方法执行");
    }

    public void setName(String name) {
        System.out.println("第二步：给对象的属性赋值");
        this.name = name;
    }

    // 这个方法需要自己写，自己配，方法名随意
    public void initBean() {
        System.out.println("第三步：初始化Bean");
    }

    // 这个方法需要自己写，自己配，方法名随意
    public void destroyBean() {
        System.out.println("第五步：销毁Bean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("Bean的类加载器：" + classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("生产Bean的工厂：" + beanFactory);
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean的名字：" + name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean的afterPropertiesSet方法执行...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean的destroy方法执行...");
    }
}
