package com.zy.designmode.interpretermode;

import java.util.Map;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2018/4/21
 * Time:15:45
 */
public class VarExpress extends Express {
    private String key;

    public VarExpress(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        return map.get(key);
    }
}
