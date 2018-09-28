package com.zy.designmode.proxy.commonframework;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/11/30
 * Time:20:11
 */
public class ConcreteSubject implements Subject {
    public void doSomething() {
        System.out.println("真实主题干活了");
    }
}
