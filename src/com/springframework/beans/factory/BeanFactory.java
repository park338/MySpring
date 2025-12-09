package com.springframework.beans.factory;

import com.springframework.beans.BeansException;

public interface BeanFactory {
    //获取bean对象
    public Object getBean(String name) throws BeansException;

    //重载getBean方法
    Object getBean(String name, Object... args) throws BeansException;
}
