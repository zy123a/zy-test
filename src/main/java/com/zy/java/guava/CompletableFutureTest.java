package com.zy.java.guava;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2018/3/16
 * Time:21:50
 */
public class CompletableFutureTest {
    public static void main(String[] args) throws Exception{
        // 等待线程执行100毫秒后，主动触发客户端执行后续流程
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(20000);
                System.out.println("zhengyin");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "zhengyin";
        });
        try {
            future.complete("100");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 测试whenComplete 方法
        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(()-> 100);
        Future<Integer> f = future3.whenComplete((v, e) -> {
            System.out.println(v);
            System.out.println(e);
        });
        System.out.println(f.get());

        // 测试 thenAccept 方法
        CompletableFuture<Integer> future4 = CompletableFuture.supplyAsync(() -> {
            return 100;
        });
        future4.thenAccept(System.out::println);
        System.out.println(future4.get());

        // 测试  thenAcceptBoth 方法
        CompletableFuture<Integer> future5 = CompletableFuture.supplyAsync(() -> {
            return 100;
        });
        CompletableFuture<Void> f3 =  future.thenAcceptBoth(CompletableFuture.completedFuture(10), (x, y) -> System.out.println(x + y));
        System.out.println(f3.get());



        // 等待所有线程执行结束后，获取各个线程结果
        Random rand = new Random();
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000 + rand.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "def";
        });
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(100 + rand.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "abc";
        });
        CompletableFuture<List<String>> f4 = sequence(Arrays.asList(future1, future2));
        for(String s : f4.get()) {
            System.out.println(s);
        }
    }

    public static CompletableFuture<List<String>> sequence(List<CompletableFuture<String>> futures) {
        CompletableFuture<Void> allDoneFuture = CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]));
        return allDoneFuture.thenApply(v -> futures.stream().map(CompletableFuture::join).collect(Collectors.<String>toList()));
    }
}
