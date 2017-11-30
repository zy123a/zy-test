package com.zy.designmode.buildermode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/11/28
 * Time:18:09
 */
public class BMWCar extends AbstractCarModel {
    public void engine() {
        System.out.println("宝马汽车启动引擎");
    }

    public void horn() {
        System.out.println("宝马汽车发出喇叭声音");
    }

    public void start() {
        System.out.println("宝马汽车跑");
    }

    public void stop() {
        System.out.println("宝马汽车停止");
    }
}
