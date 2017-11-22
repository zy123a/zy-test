package com.zy.test;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;

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

    public static void main(String[] args) {
        log.info("测试info日志输出");
        log.warn("测试warn日志输出");
        log.error("测试error日志输出");
        long i=1500369935000l;
        Date date = new Date(i);
        System.out.println(date.toString());
    }
}


