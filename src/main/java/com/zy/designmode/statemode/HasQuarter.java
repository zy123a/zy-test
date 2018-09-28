package com.zy.designmode.statemode;

import java.util.Random;

/**
 * Desc:具体状态对象，将行为委托给具体的状态
 * ------------------------------------
 * Author:XXX
 * Date:2017/8/24
 * Time:11:27
 */
public class HasQuarter implements State {
    private CumballMachine cumballMachine;

    public HasQuarter(CumballMachine cumballMachine) {
        this.cumballMachine = cumballMachine;
    }
    public void insertQuarter() {
        System.out.println("HasQuarter，已存在钱币，不用再投币了");
    }

    public void ejectQuarter() {
        System.out.println("HasQuarter，退币，进入NoQuarter");
        cumballMachine.setState(cumballMachine.getNoQuarter());
    }

    public void turnCrank() {
        System.out.println("HasQuarter，转轴，进入soldState");
        int in= new Random().nextInt(100);
        if (in % 3 == 1) {
            cumballMachine.setState(cumballMachine.getSoldState());
        } else {
            cumballMachine.setState(cumballMachine.getWinnerState());
        }
    }

    public void dispense() {
        System.out.println("HasQuarter，未经过转轴，不可发放糖果");
    }
}
