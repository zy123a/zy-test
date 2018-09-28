package com.zy.proxy;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/5/8
 * Time:15:52
 */
public class SayHello implements Hello {
    public void say(String name) {
        System.out.println(name);
    }

    public String bye(String name) {
        System.out.println(name);
        return name;
    }
}
