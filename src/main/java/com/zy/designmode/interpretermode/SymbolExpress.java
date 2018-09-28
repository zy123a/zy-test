package com.zy.designmode.interpretermode;

import java.util.Map;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2018/4/21
 * Time:15:46
 */
public abstract class SymbolExpress extends Express {
    protected Express left;
    protected Express right;

    public SymbolExpress(Express left, Express right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        return 0;
    }
}
