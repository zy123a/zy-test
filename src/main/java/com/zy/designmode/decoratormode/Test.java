package com.zy.designmode.decoratormode;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/9/1
 * Time:17:46
 */
public class Test {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        //加糖Coffee
        Beverage coffee1 = new SugarDecorator(coffee);
        //即加糖，也加奶Coffee
        Beverage coffee2 = new MilkDecorator(coffee1);
        System.out.println(coffee2.getDescription());
        System.out.println("价格：" + coffee2.getPrice());
    }
}
