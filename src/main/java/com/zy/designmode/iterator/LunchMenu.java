package com.zy.designmode.iterator;

import java.util.Iterator;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/8/4
 * Time:12:16
 */
public class LunchMenu implements Menu {
    String[] menu;

    public LunchMenu() {
        menu = new String[20];
        menu[0] = "黄焖鸡米饭";
        menu[1] = "牛肉米饭";
        menu[2] = "鱼香茄子盖饭";
    }

    public Iterator createIterator() {
        return new LunchMenuIterater(this.menu);
    }
}
