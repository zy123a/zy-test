package com.zy.designmode.statemode;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/8/24
 * Time:11:30
 */
public class SoldOutState implements State {
    private CumballMachine cumballMachine;

    public SoldOutState(CumballMachine cumballMachine) {
        this.cumballMachine = cumballMachine;
    }

    public void insertQuarter() {
        System.out.println("SoldOutState,不可投币");
    }

    public void ejectQuarter() {
        System.out.println("SoldOutState,不可退币");
    }

    public void turnCrank() {
        System.out.println("SoldOutState,不可转轴");
    }

    public void dispense() {
        System.out.println("SoldOutState,不可发放糖果");
    }
}
