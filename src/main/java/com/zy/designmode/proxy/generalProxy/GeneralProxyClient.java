package com.zy.designmode.proxy.generalProxy;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/10/19
 * Time:10:53
 */
public class GeneralProxyClient {
    public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy("郑印");
        proxy.login("zhengyin", "134138");
        proxy.killBoss();
        proxy.upgrade();
    }
}

