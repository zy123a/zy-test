package com.zy.designmode.commandmode;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/7/11
 * Time:19:56
 */
public class DropFan implements Fan {

    public void off() {
        System.out.println("关闭吊扇");
    }

    public void on() {
        System.out.println("打开吊扇");
    }
}

