package com.zy.designmode.visitormode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2018/3/10
 * Time:20:47
 */
public interface IVisitor {
    void visit(ConcreteElement1 element1);

    void visit(ConcreteElement2 element2);
}
