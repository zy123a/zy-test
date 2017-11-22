package com.zy.designmode.decoratormode;

/**
 * Desc:基础组件 茶叶  tea
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/9/1
 * Time:17:39
 */
public class Tea implements Beverage {
    public String getDescription() {
        return "tea ";
    }

    public Double getPrice() {
        return 4.0;
    }
}
