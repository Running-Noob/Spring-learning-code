package com.f.spring6.service;

import com.f.spring6.dao.UserDao;

/**
 * @author fzy
 * @date 2024/1/17 15:16
 */
public class UserService2 {
    private UserDao userDao;

    public UserService2(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser() {
        userDao.insert();
    }
}
