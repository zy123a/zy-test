package com.zy.stream;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2018/3/14
 * Time:20:03
 */
public class MyOverMethodTest {
    public static void overLoad(IntegerPredicate integerPredicate) {
        integerPredicate.test();
        System.out.println("integerPredicate");
    }

    public static void overLoad(Predicate predicate) {
        predicate.test();
        System.out.println("predicate");
    }

    public static void main(String[] args) {
        overLoad(() -> System.out.println("mm"));
    }
}
