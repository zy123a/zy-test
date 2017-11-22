package com.zy.designmode.chainofresponsibility.example01;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/6/25
 * Time:19:53
 */
public class MessageFilter implements Filter {

    public String doFilter(String msg, ChainFilter chainFilter) {
        System.out.println("HTMLFilter.doFilter");
        msg=msg.replace("mm", "李四");
        return chainFilter.doFilter(msg,chainFilter);
    }
}