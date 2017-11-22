package com.zy.designmode.statemode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/8/31
 * Time:18:31
 */
public class Test {
    public static void main(String[] args) {
        CumballMachine cumballMachine = new CumballMachine(4);
        cumballMachine.insertQuarter();
        cumballMachine.turnCrank();
        cumballMachine.dispense();
    }
}
