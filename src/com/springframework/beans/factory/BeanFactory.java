package com.springframework.beans.factory;

import com.springframework.beans.BeansException;

public interface BeanFactory {
    //获取bean对象
    public Object getBean(String name) throws BeansException;
}
