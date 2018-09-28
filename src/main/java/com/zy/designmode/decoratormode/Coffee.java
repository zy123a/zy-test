package com.zy.designmode.decoratormode;

/**
 * Desc:基础组件，原味Coffee
 * ------------------------------------
 * Author:XXX
 * Date:2017/9/1
 * Time:17:36
 */
public class Coffee implements Beverage {

    public String getDescription() {
        return "coffee";
    }

    public Double getPrice() {
        return 9.0;
    }
}
