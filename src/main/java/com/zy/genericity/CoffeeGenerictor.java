package com.zy.genericity;

import java.util.Iterator;

/**
 * Desc:泛型和迭代器的使用
 * ------------------------------------
 * Author:XXX
 * Date:2017/6/11
 * Time:10:53
 */
public class CoffeeGenerictor implements Generictor<Coffee>, Iterable<Coffee> {
    private int size;

    public CoffeeGenerictor(int size) {
        this.size = size;
    }

    public Coffee instance() {
        return new Coffee();
    }

    public Iterator<Coffee> iterator() {
        return new Iterator<Coffee>() {
            public boolean hasNext() {
                size--;
                return size > 0;
            }

            public Coffee next() {
                return CoffeeGenerictor.this.instance();
            }

            public void remove() {

            }
        };
    }

    public static void main(String[] args) {
        for(Coffee coffee : new CoffeeGenerictor(12)) {
            System.out.println(coffee);
        }
    }
}
