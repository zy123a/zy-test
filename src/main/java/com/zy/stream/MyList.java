package com.zy.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2018/3/12
 * Time:19:43
 */
public class MyList {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("zhengyin");
        list.add("zhengshuai");
        list.add("zhengyan");
        // 过滤，统计个数
        long count = list.stream().filter(t -> t.contains("zheng")).count();
        System.out.println("包含zheng的字符串个数："+count);

        list.parallelStream().map(t -> {
            System.out.println("adfadfafsmm");
            throw new RuntimeException();
        });
        try {
            Thread.sleep(12394l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // collect list的自动生成
        List<String> list1= Stream.of("a","b","c").collect(Collectors.toList());

         // map object的转换
        List<String> list2=list.stream().map(t -> t.equals("zhengyin")?null:t).collect(Collectors.toList());


        // 流的整合 flatMap
        List<String> list3 = Stream.of(Arrays.asList("ba", "c"), Arrays.asList("e")).flatMap(t -> t.stream())
                .collect(Collectors.toList());

        // min 类的比较
        System.out.println(list3.stream().min(Comparator.comparing(track -> track.length())).get());

    }
}
