package com.zy.designmode.visitormode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2018/3/10
 * Time:20:45
 */
public abstract class Element {
    public abstract void doSomeThing();

    public abstract void accept(IVisitor visitor);
}

