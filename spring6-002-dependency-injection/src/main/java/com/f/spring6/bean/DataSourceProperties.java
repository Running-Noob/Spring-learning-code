package com.f.spring6.bean;

import java.util.Properties;

/**
 * @author fzy
 * @date 2024/1/17 20:38
 */
public class DataSourceProperties {
    // Properties本质上也是一个Map集合
    // Properties的父类Hashtable，Hashtable实现了Map接口
    // 虽然这个也是一个Map集合，但是和Map的注入方式不同
    // Properties的key和value只能是String类型
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "DataSourceProperties{" +
                "properties=" + properties +
                '}';
    }
}
