package com.zy.designmode.prototype_mode;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/12/4
 * Time:20:45
 */
public class Test {
    public static void main(String[] args) throws Exception {
        ConcretePrototype prototype = new ConcretePrototype();
        ConcretePrototype prototype1 = prototype.clone();
        prototype.add("prototype 干活了");
        prototype.doSomeThing();
        prototype1.add("prototype1 干活了");
        prototype1.doSomeThing();

    }
}
