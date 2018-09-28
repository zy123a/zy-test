package com.zy.designmode.chainofresponsibility.example01;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/6/25
 * Time:19:54
 */
public class TestFilter {

    public static void main(String[] args) {

        String msg="zymm";
        ChainFilter chainFilter = new ChainFilter();
        chainFilter.addFilter(new HTMLFilter());
        chainFilter.addFilter(new MessageFilter());
        msg=chainFilter.doFilter(msg,chainFilter);

        System.out.println(msg);

    }
}
