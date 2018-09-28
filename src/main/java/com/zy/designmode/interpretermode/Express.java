package com.zy.designmode.interpretermode;

import java.util.Map;

/**
 * Desc:解释器模式，模拟加减法
 * ------------------------------------
 * Author:XXX
 * Date:2018/4/21
 * Time:15:26
 */
public abstract class Express {
    public abstract int interpreter(Map<String, Integer> map);
}
