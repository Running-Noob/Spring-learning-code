package com.f.spring6.biz;

import org.springframework.stereotype.Service;

/**
 * @author fzy
 * @date 2024/1/26 11:18
 */
@Service
public class VipService {   // 目标对象
    public void saveVip() { // 目标方法
        System.out.println("新增会员信息");
    }

    public void deleteVip() {   // 目标方法
        System.out.println("删除会员信息");
    }

    public void modifyVip() {   // 目标方法
        System.out.println("修改会员信息");
    }

    public void getVip() {
        System.out.println("获取会员信息");
    }
}
