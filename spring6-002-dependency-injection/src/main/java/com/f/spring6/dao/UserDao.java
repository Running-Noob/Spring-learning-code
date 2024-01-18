package com.f.spring6.dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author fzy
 * @date 2024/1/17 14:36
 */
public class UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDao.class);

    public void insert() {
        logger.info("数据库正在保存用户信息...");
    }
}