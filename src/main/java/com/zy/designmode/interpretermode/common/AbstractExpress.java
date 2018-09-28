package com.zy.designmode.interpretermode.common;

/**
 * Desc:抽象解释器，具体解释器由各个实现完成，具体的解释器
 * 分别为TerminalExpress，NonterminalExpress
 * ------------------------------------
 * Author:XXX
 * Date:2018/4/21
 * Time:15:29
 */
public abstract class AbstractExpress {
    public abstract Object interpreter(Context context);
}
