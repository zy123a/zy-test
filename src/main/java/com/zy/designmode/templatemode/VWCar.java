package com.zy.designmode.templatemode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/7/23
 * Time:18:35
 */
public class VWCar extends Car {
    protected void stop() {
        System.out.println("大众汽车，停车");
    }

    public void start() {
        System.out.println("大众汽车，启动");
    }
}
