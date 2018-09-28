package com.zy.designmode.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Desc:早餐菜单
 * ------------------------------------
 * Author:XXX
 * Date:2017/8/4
 * Time:12:12
 */
public class BreakfastMenu implements Menu {
    List<String> list;

    public BreakfastMenu() {
        this.list = new ArrayList<String>();
        list.add("油条");
        list.add("包子");
        list.add("粥");
    }

    public Iterator createIterator() {
        return this.list.iterator();
    }

}

