package com.zy.test;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/5/27
 * Time:00:23
 */
public class JavaBaseTest {
    public static void tese() {
        int y=32;
//     ++自加符号优先级高但是仅表现在一个表达式里
        if (y == 33 &&  ++y>0)
        System.out.println(y);
    }

    public static void tese2() {
        int y=33;
        if (y == 33 &  ++y>0);
        System.out.println(y);
    }
    public static void main(String[] args) {
        tese();
        tese2();
    }
}
