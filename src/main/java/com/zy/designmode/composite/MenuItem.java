package com.zy.designmode.composite;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/8/6
 * Time:15:37
 */
public class MenuItem extends MenuComponent {
    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }

}
