package com.zy.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/7/18
 * Time:17:16
 */
public class ExecutorTest {

    private static ExecutorService service = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        service.submit(new Runnable() {
            public void run() {
                System.out.println("zhengyin");
            }
        });
    }

}
