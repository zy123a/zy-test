package com.zy.designmode.visitormode;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2018/3/10
 * Time:20:53
 */
public class Client {
    public static void main(String[] args) {
        List<Element> list = new ArrayList<Element>();
        Visitor visitor = new Visitor();
        Element element = new ConcreteElement1();
        list.add(element);
        Element element1 = new ConcreteElement2();
        list.add(element1);
        for(Element e : list) {
            e.accept(visitor);
        }
    }
}
