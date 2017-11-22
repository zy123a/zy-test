package com.zy.designmode.statemode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/8/24
 * Time:11:29
 */
public class SoldState implements State {
    private CumballMachine cumballMachine;

    public SoldState(CumballMachine cumballMachine) {
        this.cumballMachine = cumballMachine;
    }

    public void insertQuarter() {
        System.out.println("SoldState,不允许投币");
    }

    public void ejectQuarter() {
        System.out.println("SoldState,不允许退币");
    }

    public void turnCrank() {
        System.out.println("SoldState,不允许转轴");
    }

    public void dispense() {
        cumballMachine.releaseBall();
        if (cumballMachine.getCount() > 0) {
            cumballMachine.setState(cumballMachine.getNoQuarter());
        } else {
            System.out.println("糖果售完");
            cumballMachine.setState(cumballMachine.getSoldOutState());
        }
    }
}
