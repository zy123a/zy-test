package com.zy.designmode.proxy.commonframework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/11/30
 * Time:20:12
 */
public class SubjectHandler implements InvocationHandler {

    private Object object;

    public SubjectHandler(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       if (method.getName().equals("doSomething")){
           new AdviceImpl().execute();
       }
        return method.invoke(object, args);
    }
}
