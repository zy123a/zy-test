package com.zy.designmode.explainmode;

import java.util.Map;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2018/4/7
 * Time:22:07
 */
public class MinusExpression extends Expression {
    private Expression left;
    private Expression right;

    public MinusExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        return this.left.interpreter(map) - this.right.interpreter(map);
    }
}
