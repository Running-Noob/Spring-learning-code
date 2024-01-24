package com.f.spring6.bean3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author fzy
 * @date 2024/1/24 13:02
 */
@Component
public class Product {
    private String name;
    private double price;

    public Product(@Value("苹果") String name, @Value("10.0") double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
