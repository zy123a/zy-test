package com.zy.designmode.composite;

import java.util.Iterator;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/8/6
 * Time:15:46
 */
public class NullIterator implements Iterator {
    public boolean hasNext() {
        return false;
    }

    public Object next() {
        return null;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
