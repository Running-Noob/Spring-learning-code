package cn.f.spring6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 编写一个类，代替Spring框架的配置文件
 *
 * @author fzy
 * @date 2024/1/24 14:04
 */
// 配置类使用@Configuration注解进行标注
@Configuration
// 通过@ComponentScan注解配置要扫描的包
@ComponentScan({"cn.f.spring6.dao", "cn.f.spring6.service"})
public class Spring6Config {
}
