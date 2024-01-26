package com.f.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author fzy
 * @date 2024/1/25 15:03
 */
@Component
@Aspect // 切面类是需要使用@Aspect注解进行标注的
@Order(2)
public class LogAspect {    // 切面
    // 切面 = 通知 + 切点
    // 通知就是具体要编写的增强代码
    // @Before注解标注的方法就是一个前置通知
    // @Before(切点表达式)
    // 前置通知
    //@Before("execution(* com.f.spring6.service..*(..))")
    @Before("commonPointCut()")
    public void beforeAdvice() {
        System.out.println("我是一段前置通知...");
    }

    // 后置通知
    //@AfterReturning("execution(* com.f.spring6.service..*(..))")
    @AfterReturning("commonPointCut()")
    public void afterReturningAdvice() {
        System.out.println("我是一段后置通知...");
    }

    // 环绕通知(环绕通知是最大的通知，前环绕在前置通知之前，后环绕在所有通知之后)
    //@Around("execution(* com.f.spring6.service..*(..))")
    @Around("commonPointCut()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        // 前面的增强代码
        // 这段增强代码在前置通知之前执行
        System.out.println("前环绕...");
        // 切点
        joinPoint.proceed();
        // 后面的增强代码
        // 这段增强代码在后置通知之后执行
        System.out.println("后环绕...");
    }

    // 异常通知
    //@AfterThrowing("execution(* com.f.spring6.service..*(..))")
    @AfterThrowing("commonPointCut()")
    public void afterThrowingAdvice() {
        System.out.println("我是一段异常通知");
    }

    // 最终通知(finally语句块中的通知)
    //@After("execution(* com.f.spring6.service..*(..))")
    @After("commonPointCut()")
    public void afterAdvice() {
        System.out.println("我是一段最终通知...");
    }

    // 通用切点，解决切点表达式复用问题
    // 定义通用的切点表达式
    @Pointcut("execution(* com.f.spring6.service..*(..))")
    public void commonPointCut() {
        // 这个方法只是一个标记，方法名随意，方法体中也不需要写任何代码
    }
}