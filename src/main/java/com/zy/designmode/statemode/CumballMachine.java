package com.zy.designmode.statemode;

import lombok.Data;

/**
 * Desc:自动售货机
 * ------------------------------------
 * Author:XXX
 * Date:2017/8/24
 * Time:11:32
 */
@Data
public class CumballMachine implements State{
    private State hasQuarter;
    private State noQuarter;
    private State soldState;
    private State soldOutState;
    private State winnerState;
    private State state;      // 售货机当前状态
    private int count;         // 售货机糖果数量

    public CumballMachine(int count) {
        hasQuarter = new HasQuarter(this);
        noQuarter = new NoQuarter(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        this.state = noQuarter;
    }

    public void releaseBall() {
        System.out.println("发放糖果");
        this.count--;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    public void dispense() {
        state.dispense();
    }
}
