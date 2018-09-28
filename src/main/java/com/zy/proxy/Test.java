package com.zy.proxy;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/5/8
 * Time:15:58
 */
public class Test {
    public static void main(String[] args) {
//        SayHello sayHello=new SayHello();
//        JDKProxy jdkProxy=new JDKProxy();
//        Hello hello = (Hello)jdkProxy.getProxyCalss(sayHello);
//        hello.say("XXX");
//        hello.bye("zhengshuai");
        CGLIBProxy cglibProxy=new CGLIBProxy();
        Hello hello1=(Hello)cglibProxy.getProxyClass(SayHello.class);
        hello1.say("XXX");
        hello1.bye("zhengshuai");
        System.out.println(new Test().m());
        System.out.println();
    }

    public String m() {
//        new Callable<>() {
//            public Object call() throws Exception {
//                return null;
//            }
//        }).start();
        return null;
    }
}
