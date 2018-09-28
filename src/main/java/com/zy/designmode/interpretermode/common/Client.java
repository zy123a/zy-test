package com.zy.designmode.interpretermode.common;

import java.util.Stack;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2018/4/21
 * Time:15:36
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
//       通常定义一个语法容器，容纳一个具体的表达式，通常为List,stack等；
        Stack<AbstractExpress> stack = new Stack<>();
        for(;;) {
//            进行语法判断，并产生递归调用
        }
//       产生一个完成的语法树
//        AbstractExpress express = stack.pop();
//        具体元素进入场景
//        express.interpreter(context);
    }
}
