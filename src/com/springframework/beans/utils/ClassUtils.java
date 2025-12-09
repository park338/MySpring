package com.springframework.beans.utils;

import java.security.SecureClassLoader;

public class ClassUtils {
    public static ClassLoader getDefaultClassLoader(){
        ClassLoader cl = null;

        try {
            // 1. 首先尝试：获取当前线程的上下文类加载器
            cl = Thread.currentThread().getContextClassLoader();
        } catch (Throwable ex) {
            // 忽略异常，继续尝试其他方式
        }

        if (cl == null) {
            // 2. 然后尝试：获取加载ClassUtils类的类加载器
            cl = ClassUtils.class.getClassLoader();

            if (cl == null) {
                try {
                    // 3. 最后尝试：获取系统类加载器
                    cl = ClassLoader.getSystemClassLoader();
                } catch (Throwable ex) {
                    // 仍然忽略异常
                }
            }
        }

        return cl;
    }
}
