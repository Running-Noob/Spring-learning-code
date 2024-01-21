package org.myspringframework.core;

/**
 * myspring框架应用上下文接口
 *
 * @author fzy
 * @date 2024/1/21 20:45
 */
public interface ApplicationContext {
    /**
     * 根据Bean的名称获取对应的Bean对象
     *
     * @param beanName myspring配置文件中Bean标签的id
     * @return 对应的单例Bean对象
     */
    public Object getBean(String beanName);
}
