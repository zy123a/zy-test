package com.zy.designmode.templatemode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/7/23
 * Time:18:36
 */
public class AudiCar extends Car {
    protected void stop() {
        System.out.println("奥迪汽车，停车");
    }

    public void start() {
        System.out.println("奥迪汽车，启动");
    }
}
