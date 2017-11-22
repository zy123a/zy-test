package com.zy.designmode.decoratormode;

/**
 * Desc:糖装饰者
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/9/1
 * Time:17:40
 */
public class SugarDecorator implements Beverage {
    private Beverage beverage;

    public SugarDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+"   加糖";
    }

    public Double getPrice() {
        return beverage.getPrice()+2.3;
    }
}
