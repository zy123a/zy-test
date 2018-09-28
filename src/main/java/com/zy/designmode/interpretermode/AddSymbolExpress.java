package com.zy.designmode.interpretermode;

import java.util.Map;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2018/4/21
 * Time:15:48
 */
public class AddSymbolExpress extends SymbolExpress {

    public AddSymbolExpress(Express left, Express right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        return super.left.interpreter(map) + super.right.interpreter(map);
    }
}
