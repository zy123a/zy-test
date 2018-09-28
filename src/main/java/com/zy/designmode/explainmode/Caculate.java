package com.zy.designmode.explainmode;

import java.util.HashMap;
import java.util.Stack;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2018/4/7
 * Time:22:08
 */
public class Caculate {
    private Expression expression;

    public Caculate(String str) {
        char[] chars = str.toCharArray();
        Stack<Expression> stack = new Stack<>();
        for(int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
            case '+': {
                Expression expression = stack.pop();
                stack.push(new AddExpression(expression, new VarExpression(String.valueOf(chars[++i]))));
                break;
            }
            case '-': {
                Expression expression = stack.pop();
                stack.push(new MinusExpression(expression, new VarExpression(String.valueOf(chars[++i]))));
                break;
            }
            default:
                stack.push(new VarExpression(String.valueOf(chars[i])));
            }
        }
        this.expression = stack.pop();
    }

    public int run(HashMap<String, Integer> map) {
        return expression.interpreter(map);
    }
}
