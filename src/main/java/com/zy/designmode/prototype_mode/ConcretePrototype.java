package com.zy.designmode.prototype_mode;

import java.util.ArrayList;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/12/4
 * Time:20:43
 */
public class ConcretePrototype implements PrototypeInferance {
    private ArrayList<String> list = new ArrayList<String>();

    public void doSomeThing() {
        System.out.println(this.list.get(0));
    }

    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        ConcretePrototype concretePrototype=(ConcretePrototype)super.clone();
        ArrayList<String> lista = (ArrayList<String>)this.list.clone();
        concretePrototype.setList(lista);
        return concretePrototype;
    }

    public void add(String str) {
        this.list.add(str);
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }
}
