package com.f.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author fzy
 * @date 2024/1/20 21:23
 */
public class PersonFactoryBean implements FactoryBean<Person> {
    @Override
    public Person getObject() throws Exception {
        // 最终这个Bean的创建还是程序员自己new的
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    // 这个方法在接口中有默认实现
    // 默认返回true，表示单例
    // 如果想多例，直接将这个方法的返回值修改为false即可
    @Override
    public boolean isSingleton() {
        return true;
    }
}