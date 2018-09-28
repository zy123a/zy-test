package com.zy.designmode.statemode;

/**
 * Desc:糖果自动售货机为例应用状态模式,共有四种行为：投币，退币，转轴，发放糖果
 * 五种状态：有币，无币，售出糖果，告罄，中奖赢家；
 * ------------------------------------
 * Author:XXX
 * Date:2017/8/24
 * Time:11:16
 */
public interface State {
//  投币
    void insertQuarter();
//  退币
    void ejectQuarter();
//  转轴
    void turnCrank();
//  发放糖果
    void dispense();
}
