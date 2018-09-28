package com.zy.designmode.buildermode;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/11/28
 * Time:18:12
 */
public class BenzCar extends AbstractCarModel {
    public void engine() {
        System.out.println("奔驰汽车启动引擎");
    }

    public void horn() {
        System.out.println("奔驰汽车发出喇叭声音");
    }

    public void start() {
        System.out.println("奔驰汽车跑");
    }

    public void stop() {
        System.out.println("奔驰汽车停止");
    }
}
