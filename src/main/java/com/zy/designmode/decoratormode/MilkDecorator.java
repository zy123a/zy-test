package com.zy.designmode.decoratormode;

/**
 * Desc:奶装饰者
 * ------------------------------------
 * Author:XXX
 * Date:2017/9/1
 * Time:17:45
 */
public class MilkDecorator implements Decorator {
    private Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+"  加奶";
    }

    public Double getPrice() {
        return beverage.getPrice()+3;
    }
}
