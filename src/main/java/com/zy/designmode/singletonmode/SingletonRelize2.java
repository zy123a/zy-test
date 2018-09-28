package com.zy.designmode.singletonmode;

/**
 * Desc:这种实现方法，线程不安全
 * ------------------------------------
 * Author:XXX
 * Date:2017/11/22
 * Time:20:25
 */
public class SingletonRelize2 {
    private static SingletonRelize2 singletonRelize2;

    private SingletonRelize2() {
    }

    public SingletonRelize2 getInstance() {
        if (singletonRelize2 == null) {
            singletonRelize2 = new SingletonRelize2();
        }
        return singletonRelize2;
    }

}
