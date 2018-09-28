package com.zy.java.guava;

import com.google.common.util.concurrent.*;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/9/15
 * Time:12:35
 */
public class GuavaTest {
    ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws Exception {
        GuavaTest guavaTest = new GuavaTest();
        ListeningExecutorService service = MoreExecutors.listeningDecorator(guavaTest.executorService);
        ListenableFuture<String> listenableFuture = service.submit(new Callable<String>() {
            public String call() throws Exception {
                return "线程执行完成";
            }
        });
        Futures.addCallback(listenableFuture, new FutureCallback<String>() {
            public void onSuccess(String s) {
                System.out.println("输出成功：" + s);
            }

            public void onFailure(Throwable throwable) {
                System.out.println("输出失败：");
            }
        });
    }
}
