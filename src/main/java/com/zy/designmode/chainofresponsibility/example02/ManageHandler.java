package com.zy.designmode.chainofresponsibility.example02;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/6/25
 * Time:20:48
 */
public class ManageHandler extends Handler {
    public String handle(String user, double fee) {
        if (fee > 500) {
            if ("李四".equals(user)) {
                return "同意" + user + "报销餐费" + fee;
            } else {
                return "不统一同意" + user + "报销餐费" + fee;
            }
        }
        if (getSuccess() != null) {
            return getSuccess().handle(user, fee);
        }
        return null;
    }
}
