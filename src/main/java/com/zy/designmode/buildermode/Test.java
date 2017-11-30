package com.zy.designmode.buildermode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/11/28
 * Time:18:25
 */
public class Test {
    public static void main(String[] args) {
        AbstractCarModel benzCar = Director.buildBenzCar();
        benzCar.run();
        AbstractCarModel bmwCar = Director.buildBWMCar();
        bmwCar.run();
    }
}
