package com.f.spring6.biz;

import org.springframework.stereotype.Service;

/**
 * @author fzy
 * @date 2024/1/26 11:18
 */
@Service
public class UserService {  // 目标对象
    public void saveUser() {    // 目标方法
        System.out.println("新增用户信息");
    }

    public void deleteUser() {  // 目标方法
        System.out.println("删除用户信息");
    }

    public void modifyUser() {  // 目标方法
        System.out.println("修改用户信息");
    }

    public void getUser() {
        System.out.println("获取用户信息");
    }
}
