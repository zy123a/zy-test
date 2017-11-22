package com.zy.designmode.strategy;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/9/22
 * Time:17:35
 */
public class Test {
    public static void main(String[] args) {
        StrategyContext strategyContext = new StrategyContext();
        strategyContext.setSortStrategy(new SelectSortStrategy());
        int[] a = { 3, 23, 12, 43, 123, 1 };
        a = strategyContext.sort(a);
        for(int b : a) {
            System.out.println(b);
        }
    }
}
