package com.zy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/5/8
 * Time:15:54
 */
public class JDKProxy implements InvocationHandler {
    private Object targe;

    public Object getProxyCalss(Object targe) {
        this.targe=targe;
        return Proxy.newProxyInstance(targe.getClass().getClassLoader(), targe.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK start");
        Object o = method.invoke(targe, args);
        System.out.println("JDK end");
        return o;
    }
}
