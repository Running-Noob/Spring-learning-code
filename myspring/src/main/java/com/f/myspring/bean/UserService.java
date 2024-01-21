package com.f.myspring.bean;

/**
 * @author fzy
 * @date 2024/1/21 20:37
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.insert();
    }
}
