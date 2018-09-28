package com.zy.designmode.interpretermode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2018/4/21
 * Time:16:00
 */
public class Calculator {

    private Express express;

    public Calculator(String expStr) {
        Stack<Express> stack = new Stack<>();
        char[] chars = expStr.toCharArray();

        Express left = null;
        Express right = null;
        for(char s : chars) {
            switch (s) {
            case '+':
                left = stack.pop();
                right = new VarExpress(String.valueOf(s));
                stack.push(new AddSymbolExpress(left, right));
                break;
            case '-':
                left = stack.pop();
                right = new VarExpress(String.valueOf(s));
                stack.push(new SubSymbolExpress(left, right));
                break;
            default:
                stack.push(new VarExpress(String.valueOf(s)));
            }
        }
        this.express = stack.pop();
    }

    public Express getExpress() {
        return express;
    }

    public static void main(String[] args) {
        Calculator caculate = new Calculator("a+b-c");
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 4);
        map.put("b", 5);
        map.put("c", 3);
        Express express = caculate.getExpress();
        System.out.println(express.interpreter(map));
    }
}
