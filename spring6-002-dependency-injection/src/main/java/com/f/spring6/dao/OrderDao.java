package com.f.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author fzy
 * @date 2024/1/17 15:37
 */
public class OrderDao {
    private static final Logger logger = LoggerFactory.getLogger(OrderDao.class);

    public void generate() {
        logger.info("正在生成订单...");
    }
}
