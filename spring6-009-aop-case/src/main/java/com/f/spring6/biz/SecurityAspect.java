package com.f.spring6.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author fzy
 * @date 2024/1/26 11:20
 */
@Component
@Aspect
public class SecurityAspect {
    // com.f.spring6.biz包下所有以save开头的方法
    @Pointcut("execution(* com.f.spring6.biz..save*(..))")
    public void savePointCut() {
    }

    // com.f.spring6.biz包下所有以delete开头的方法
    @Pointcut("execution(* com.f.spring6.biz..delete*(..))")
    public void deletePointCut() {
    }

    // com.f.spring6.biz包下所有以modify开头的方法
    @Pointcut("execution(* com.f.spring6.biz..modify*(..))")
    public void modifyPointCut() {
    }

    @Before("savePointCut() || deletePointCut() || modifyPointCut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        // 得到当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowTime = sdf.format(new Date());
        // 记录日志信息
        // 如果是WEB项目，用户名字可以从Session中获取
        System.out.println(nowTime + ": " + "张三调用了 " +
                joinPoint.getSignature().getDeclaringTypeName() + " 的 " +
                joinPoint.getSignature().getName() + " 方法");
    }
}
