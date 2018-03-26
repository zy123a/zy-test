package com.zy.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/5/18
 * Time:11:05
 */
// 注解的方式
@Slf4j
public class Test {
//    直接获取slf4j的logger对象进行日志的输出
//    private static final Logger log = LoggerFactory.getLogger(Test.class);

    private static ExecutorService executorService = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
//        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        try {
            Future future=executorService.submit(new Callable<Void>() {
                public Void call() throws Exception {
                    System.out.println("mm");
                    throw new Exception();
                }
            });
            future.get();
        } catch (Exception e) {
            System.out.println("铺货异常");
        }
    }
}


