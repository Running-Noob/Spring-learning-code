package com.f.spring6.service;

import com.f.spring6.dao.UserDao;

/**
 * @author fzy
 * @date 2024/1/17 14:39
 */
public class UserService {
    private UserDao userDao;

    // set注入的话，必须提供一个set方法
    // spring容器会调用这个set方法，来给userDao属性赋值
    // 下面这个set方法是IDEA工具生成的，符合javabean规范
    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/
    // 我自己写一个set方法，不使用IDEA工具生成的，不符合javabean的规范，可以吗？
    // 也可以，但没必要。这里是演示如果这么写了，相应地在spring配置文件中该怎么写。
    public void setXyz(UserDao xyz) {
        this.userDao = xyz;
    }

    public void saveUser() {
        userDao.insert();
    }
}
