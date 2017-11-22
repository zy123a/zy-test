package com.zy.designmode.chainofresponsibility.example01;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/6/25
 * Time:19:47
 */
public class ChainFilter implements Filter {

    private List<Filter> chainFilter=new ArrayList<Filter>();
    private int index;

    public String doFilter(String msg, ChainFilter chainFilter) {
        if (index == this.chainFilter.size()) {
            return msg;
        }

        Filter filter1 = this.chainFilter.get(index);
        index++;
        return filter1.doFilter(msg,chainFilter);
    }

    public void addFilter(Filter filter) {
        chainFilter.add(filter);
    }

}
