package com.zy.designmode.chainofresponsibility.example02;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/6/25
 * Time:20:39
 */
public abstract class Handler {
    private Handler success;

    public Handler getSuccess() {
        return success;
    }

    public void setSuccess(Handler success) {
        this.success = success;
    }
    public abstract String handle(String user, double fee);
}
