package com.zy.designmode.visitormode;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2018/3/10
 * Time:20:47
 */
public interface IVisitor {
    void visit(ConcreteElement1 element1);

    void visit(ConcreteElement2 element2);
}
