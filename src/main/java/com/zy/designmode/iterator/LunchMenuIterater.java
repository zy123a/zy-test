package com.zy.designmode.iterator;

import java.util.Iterator;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/8/4
 * Time:12:19
 */
public class LunchMenuIterater implements Iterator {

    Object[] objects;
    int index = 0;

    public LunchMenuIterater(Object[] objects) {
        this.objects = objects;
    }

    public boolean hasNext() {
        if (index < objects.length && objects[index] != null) {
            return true;
        }
        return false;
    }

    public Object next() {
        return objects[index++];
    }

    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
