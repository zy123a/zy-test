package com.zy.designmode.proxy.forceProxy;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/10/19
 * Time:16:27
 */
public class ForceProxyClient {
    public static void main(String[] args) {
        IGamePlayerV2 gamePlayerV2 = new GamePlayerV2("郑印");
        IGamePlayerV2 proxy = gamePlayerV2.getProxy();
        proxy.login("XXX", "1234");
        proxy.killBoss();
        proxy.upgrade();
    }
}
