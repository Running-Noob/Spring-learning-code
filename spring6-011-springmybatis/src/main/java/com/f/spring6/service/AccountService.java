package com.f.spring6.service;

import com.f.spring6.pojo.Account;

import java.util.List;

/**
 * @author fzy
 * @date 2024/1/27 15:14
 */
public interface AccountService {
    // 开户
    int save(Account account);

    // 销户
    int deleteByActno(String actno);

    // 修改账户
    int modify(Account account);

    // 查询账户
    Account getByActno(String actno);

    // 查询所有账户
    List<Account> getAll();

    // 转账
    void transfer(String fromActno, String toActno, double money);
}
