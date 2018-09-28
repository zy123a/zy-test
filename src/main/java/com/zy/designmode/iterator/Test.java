package com.zy.designmode.iterator;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/8/4
 * Time:12:33
 */
public class Test {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(new LunchMenu(), new BreakfastMenu());
        waitress.printMenu();
    }
}
