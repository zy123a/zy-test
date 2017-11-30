package com.zy.designmode.proxy.commonframework;

/**
 * Desc:动态代理框架
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/11/30
 * Time:20:26
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = DynamicProxy.newInstanceProxy(new ConcreteSubject());
        subject.doSomething();
    }
}
