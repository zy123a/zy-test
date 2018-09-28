package com.zy.designmode.proxy.commonframework;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/11/30
 * Time:20:17
 */
public class AdviceImpl implements IAdvice {
    public void execute() {
        System.out.println("执行前置通知");
    }
}
