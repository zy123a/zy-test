package com.zy.designmode.visitormode;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2018/3/10
 * Time:20:49
 */
public class ConcreteElement2 extends Element {
    private String business;

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public void doSomeThing() {
        this.setBusiness("元素2在吃饭");
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
