package com.zy.designmode.strategy;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/9/22
 * Time:12:39
 */
public class SelectSortStrategy implements SortStrategy {

    public int[] sort(int[] a) {
        if (a == null || a.length == 0) {
            return a;
        }
        int t;
        for(int i = 0; i < a.length-1; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        return a;
    }
}
