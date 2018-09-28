package com.zy.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/5/8
 * Time:16:09
 */
public class CGLIBProxy implements MethodInterceptor{

//    private Object targe;

    public Object getProxyClass(Class myClass) {
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(myClass);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB start");
        Object o1=methodProxy.invokeSuper(o, objects);
        System.out.println("CGLIB end");
        return o1;
    }
}
