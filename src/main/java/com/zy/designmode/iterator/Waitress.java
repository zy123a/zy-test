package com.zy.designmode.iterator;

import java.util.Iterator;

/**
 * Desc:服务员
 * ------------------------------------
 * Author:XXX
 * Date:2017/8/4
 * Time:12:28
 */
public class Waitress {
    Menu luchMenu;
    Menu breakFast;

    public Waitress() {

    }

    public Waitress(Menu luchMenu, Menu breakFast) {
        this.luchMenu = luchMenu;
        this.breakFast = breakFast;
    }

    public void printMenu() {
        printMenu(luchMenu.createIterator());
        printMenu(breakFast.createIterator());
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
