package com.f.spring6.service;

import org.springframework.stereotype.Service;

/**
 * @author fzy
 * @date 2024/1/26 10:56
 */
@Service
public class AccountService {   // 目标对象
    // 目标方法
    // 转账的业务方法
    public void transfer() {
        System.out.println("正在转账...");
        // 故意抛出异常
        throw new RuntimeException();
    }

    // 目标方法
    // 取款的业务方法
    public void withdraw() {
        System.out.println("正在取款...");
    }
}
