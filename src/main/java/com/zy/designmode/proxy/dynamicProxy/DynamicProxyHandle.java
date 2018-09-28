package com.zy.designmode.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/10/19
 * Time:17:35
 */
public class DynamicProxyHandle implements InvocationHandler {
    private Object object;

    public DynamicProxyHandle(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        return result;
    }
}
