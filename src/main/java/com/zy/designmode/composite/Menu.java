package com.zy.designmode.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/8/6
 * Time:15:39
 */
public class Menu extends MenuComponent {
    private List<MenuComponent> list;

    public Menu() {
        this.list = new ArrayList();
    }

    @Override
    public void add(MenuComponent component) {
        list.add(component);
    }

    @Override
    public void print() {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            MenuComponent component = (MenuComponent) iterator.next();
            component.print();
        }
    }

}
