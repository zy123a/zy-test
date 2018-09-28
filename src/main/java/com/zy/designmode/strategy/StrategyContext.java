package com.zy.designmode.strategy;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/9/22
 * Time:17:33
 */
public class StrategyContext {
    private SortStrategy sortStrategy;

    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public int[] sort(int[] a) {
        return sortStrategy.sort(a);
    }
}
