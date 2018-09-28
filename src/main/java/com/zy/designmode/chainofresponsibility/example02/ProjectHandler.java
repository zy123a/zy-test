package com.zy.designmode.chainofresponsibility.example02;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/6/25
 * Time:20:43
 */
public class ProjectHandler extends Handler {

    public String handle(String user, double fee) {
        if (fee < 500) {
            if ("张三".equals(user)) {
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
