package com.f.spring6.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author fzy
 * @date 2024/1/25 16:21
 */
@Configuration  // 代替spring.xml文件
@ComponentScan({"com.f.spring6.service"})   // 组件扫描
// AOP配置
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Spring6Config {
}