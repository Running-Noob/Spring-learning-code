package com.f.spring6.service;

import org.springframework.stereotype.Service;

/**
 * @author fzy
 * @date 2024/1/25 15:01
 */
@Service
public class UserService {  // 目标类
    public void login() {   // 目标方法
        System.out.println("系统正在登录...");
        //if (true) {
        //    throw new RuntimeException("运行时异常...");
        //}
    }
}