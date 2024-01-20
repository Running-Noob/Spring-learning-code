package com.f.spring6.bean;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author fzy
 * @date 2024/1/20 21:47
 */
public class DateFactoryBean implements FactoryBean<Date> {
    // DateFactoryBean这个工厂Bean协助Spring创建普通的Bean：Date
    private String strDate;

    public DateFactoryBean(String strDate) {
        this.strDate = strDate;
    }

    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(strDate);
        return date;
    }

    @Override
    public Class<?> getObjectType() {
        return Date.class;
    }
}
