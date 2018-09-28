package com.zy.designmode.visitormode;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2018/3/10
 * Time:20:45
 */
public abstract class Element {
    public abstract void doSomeThing();

    public abstract void accept(IVisitor visitor);
}

