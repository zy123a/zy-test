package com.zy.designmode.strategy;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/9/22
 * Time:17:28
 */
public class InsertSortStrategy implements SortStrategy {
    public int[] sort(int[] a) {
        if (a == null || a.length == 0) {
            return a;
        }
        for(int i = 1; i < a.length; i++) {
            int t = i;
            int m = a[i];
            for(int j = i - 1; j >= 0; j--) {
                if (a[j] > m) {
                    a[j + 1] = a[j];
                    t--;
                }
            }
            a[t] = m;
        }
        return a;
    }
}
