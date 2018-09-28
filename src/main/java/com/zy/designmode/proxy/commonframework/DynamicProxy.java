package com.zy.designmode.proxy.commonframework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/11/30
 * Time:20:18
 */
public class DynamicProxy {
    public static <T> T newInstanceProxy(Subject subject) {
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class[] clazz = subject.getClass().getInterfaces();
        InvocationHandler handler = new SubjectHandler(subject);
        return (T)Proxy.newProxyInstance(classLoader, clazz, handler);
    }
}
