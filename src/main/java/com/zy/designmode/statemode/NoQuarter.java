package com.zy.designmode.statemode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/8/24
 * Time:11:28
 */
public class NoQuarter implements State {
    private CumballMachine cumballMachine;

    public NoQuarter(CumballMachine cumballMachine) {
        this.cumballMachine = cumballMachine;
    }

    public void insertQuarter() {
        System.out.println("投入钱币，状态跳转到hasQuarter");
        cumballMachine.setState(cumballMachine.getHasQuarter());
    }

    public void ejectQuarter() {
        System.out.println("该状态没给钱，不能够退还钱币");
    }

    public void turnCrank() {
        System.out.println("该状态没给钱，不能够转轴");
    }

    public void dispense() {
        System.out.println("该状态没给钱，请先投币");
    }
}
