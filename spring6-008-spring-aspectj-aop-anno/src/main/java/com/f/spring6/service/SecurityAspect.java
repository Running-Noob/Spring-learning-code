package com.f.spring6.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author fzy
 * @date 2024/1/25 15:47
 */
@Aspect
@Component
@Order(1)
public class SecurityAspect {   // 安全切面
    //@Before("execution(* com.f.spring6.service..*(..))")
    @Before("com.f.spring6.service.LogAspect.commonPointCut()")
    public void beforeAdvice(JoinPoint joinPoint) {
        // 这个JoinPoint joinPoint，在Spring容器调用这个方法的时候会自动传过来。
        // 我们可以用这个joinPoint获取目标方法的相关信息
        // 获取目标方法的签名，即 public void login() 方法的修饰符列表、方法名等
        // 方法的签名：访问权限修饰符开始到方法名
        Signature signature = joinPoint.getSignature();
        // 通过方法的签名可以获取方法的具体信息
        System.out.println("目标方法的方法名：" + signature.getName());
        System.out.println("安全切面的前置通知...");
    }
}
