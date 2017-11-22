package com.zy.designmode.chainofresponsibility.example02;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/6/25
 * Time:20:49
 */
public class TestHandler {

    public static void main(String[] args) {
        Handler projectHandler = new ProjectHandler();
        Handler manageHandler = new ManageHandler();
        projectHandler.setSuccess(manageHandler);
        String msg = projectHandler.handle("李四", 400);
        System.out.println(msg);
    }
}

