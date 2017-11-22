package com.zy.designmode.templatemode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/7/23
 * Time:18:37
 */
public class Test {

    public static void main(String[] args) {
        Car car = new AudiCar();
        Car car1 = new VWCar();
        car.templateMethod();
        car1.templateMethod();
    }
}
