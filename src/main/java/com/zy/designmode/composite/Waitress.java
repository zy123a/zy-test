package com.zy.designmode.composite;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/8/6
 * Time:15:56
 */
public class Waitress {
    private MenuComponent component;

    public Waitress(MenuComponent component) {
        this.component = component;
    }

    public void print() {
        component.print();
    }
}
