package com.zy.designmode.chainofresponsibility.example01;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/6/25
 * Time:19:40
 */
public interface Filter {
    String doFilter(String msg, ChainFilter chainFilter);
}
