package com.zy.designmode.visitormode;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2018/3/10
 * Time:20:52
 */
public class Visitor implements IVisitor {
    public void visit(ConcreteElement1 element1) {
        element1.doSomeThing();
        System.out.println(element1.getBusiness());
    }

    public void visit(ConcreteElement2 element2) {
        element2.doSomeThing();
        System.out.println(element2.getBusiness());
    }
}
