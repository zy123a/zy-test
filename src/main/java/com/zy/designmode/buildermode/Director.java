package com.zy.designmode.buildermode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/11/28
 * Time:18:23
 */
public class Director {
    public static AbstractCarModel buildBenzCar() {
        return (new BenzCarBuilder()).buildCar();
    }

    public static AbstractCarModel buildBWMCar() {
        return (new BMWCarBuilder()).buildCar();
    }
}
