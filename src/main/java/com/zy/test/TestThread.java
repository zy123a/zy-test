package com.zy.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/8/1
 * Time:12:34
 */
public class TestThread {
    public static void main(String[] args) {
//        ThreadFactory threadFactory = new DefaultThreadFactory("repeat-pay-notify-business");
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i=0;i<20;i++) {
            executorService.execute(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
    }
}
