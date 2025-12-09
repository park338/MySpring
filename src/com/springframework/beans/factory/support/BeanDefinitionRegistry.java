package com.springframework.beans.factory.support;

import com.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {
    //注册bean对象
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
