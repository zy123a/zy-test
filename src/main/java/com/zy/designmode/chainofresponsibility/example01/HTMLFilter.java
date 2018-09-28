package com.zy.designmode.chainofresponsibility.example01;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/6/25
 * Time:19:41
 */
public class HTMLFilter implements Filter {

    public String doFilter(String msg, ChainFilter chainFilter) {
        System.out.println("HTMLFilter.doFilter");
        msg = msg.replace("zy", "张三");
        return chainFilter.doFilter(msg,chainFilter);
    }
}

