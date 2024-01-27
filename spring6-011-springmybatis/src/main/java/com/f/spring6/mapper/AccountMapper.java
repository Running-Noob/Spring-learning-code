package com.f.spring6.mapper;

import com.f.spring6.pojo.Account;

import java.util.List;

/**
 * @author fzy
 * @date 2024/1/27 15:00
 */
public interface AccountMapper {    // 该接口的实现类是Mybatis通过动态代理机制动态生成的
    // 新增账户
    int insert(Account account);

    // 根据账号删除账户
    int deleteByActno(String actno);

    // 修改账户
    int update(Account account);

    // 根据账号查询账户
    Account selectByActno(String actno);

    // 查询所有账户
    List<Account> selectAll();
}
