package com.zy.designmode.visitormode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2018/3/10
 * Time:20:49
 */
public class ConcreteElement1 extends Element {
    private String business;

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public void doSomeThing() {
        this.setBusiness("元素1在送外卖");
    }

    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
