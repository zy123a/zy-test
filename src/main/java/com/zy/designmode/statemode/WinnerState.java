package com.zy.designmode.statemode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/8/24
 * Time:11:30
 */
public class WinnerState implements State {
    private CumballMachine cumballMachine;

    public WinnerState(CumballMachine cumballMachine) {
        this.cumballMachine = cumballMachine;
    }

    public void insertQuarter() {
        System.out.println("WinnerState,不允许投币");
    }

    public void ejectQuarter() {
        System.out.println("WinnerState,不允许退币");
    }

    public void turnCrank() {
        System.out.println("WinnerState,不允许转轴");
    }

    public void dispense() {
        System.out.println("恭喜中奖了");
        cumballMachine.releaseBall();
        if (cumballMachine.getCount() > 0) {
            cumballMachine.releaseBall();
            if (cumballMachine.getCount() == 0) {
                System.out.println("WinnerState,售罄，进入SoldOutState");
                cumballMachine.setState(cumballMachine.getSoldOutState());
            } else {
                System.out.println("WinnerState，进入NoQuarter");
                cumballMachine.setState(cumballMachine.getNoQuarter());
            }
        }
    }
}
