package com.zy.proxy;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/5/8
 * Time:15:58
 */
public class Test {
    public static void main(String[] args) {
//        SayHello sayHello=new SayHello();
//        JDKProxy jdkProxy=new JDKProxy();
//        Hello hello = (Hello)jdkProxy.getProxyCalss(sayHello);
//        hello.say("zhengyin");
//        hello.bye("zhengshuai");
//        CGLIBProxy cglibProxy=new CGLIBProxy();
//        Hello hello1=(Hello)cglibProxy.getProxyClass(SayHello.class);
//        hello1.say("zhengyin");
//        hello1.bye("zhengshuai");
        System.out.println(new Test().m());
//        System.out.println();
    }

    public String m() {
        try {
            int m = 1 / 0;
            return "ddd";
        } catch (Exception e) {
            return "aaa";
        } finally {
            //            System.out.println("zhengyin");
            return "ccc";
        }
    }
}
