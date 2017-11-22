package com.zy.designmode.commandmode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/7/11
 * Time:19:50
 */
public class DropLight implements Light {
    public void off() {
        System.out.println("关掉吊灯");
    }

    public void on() {
        System.out.println("打开吊灯");
    }
}
