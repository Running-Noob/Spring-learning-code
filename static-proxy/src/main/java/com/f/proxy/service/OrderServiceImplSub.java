package com.f.proxy.service;

/**
 * @author fzy
 * @date 2024/1/24 19:28
 */
public class OrderServiceImplSub extends OrderServiceImpl{
    @Override
    public void generate() {
        long begin = System.currentTimeMillis();
        super.generate();
        long end = System.currentTimeMillis();
        System.out.println("该业务耗时 " + (end - begin) + " 毫秒");
    }

    @Override
    public void modify() {
        super.modify();
    }

    @Override
    public void detail() {
        super.detail();
    }
}
