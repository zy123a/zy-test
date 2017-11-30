package com.zy.designmode.factoryMothodMode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/11/24
 * Time:10:55
 */
public class ConcreteProduct2 implements Product {
    public void doSomething() {
        System.out.println(this.getClass().getName()+"做些事情");
    }
}
