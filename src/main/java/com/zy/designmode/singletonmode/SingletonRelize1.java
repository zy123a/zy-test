package com.zy.designmode.singletonmode;

/**
 * Desc:这种实现方式，线程安全，内存内始终只有一个实例
 * ------------------------------------
 * Author:XXX
 * Date:2017/11/22
 * Time:20:21
 */
public class SingletonRelize1 {

    private final static SingletonRelize1 singletonRelize1 = new SingletonRelize1();

    private SingletonRelize1() {

    }

    public SingletonRelize1 getInstance() {
        return singletonRelize1;
    }

    public void doSomething() {

    }
}
