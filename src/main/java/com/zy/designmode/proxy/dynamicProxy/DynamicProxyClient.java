package com.zy.designmode.proxy.dynamicProxy;

import com.zy.designmode.proxy.generalProxy.GamePlayer;
import com.zy.designmode.proxy.generalProxy.IGamePlayer;

import java.lang.reflect.Proxy;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/10/19
 * Time:17:36
 */
public class DynamicProxyClient {
    public static void main(String[] args) {
        GamePlayer iGamePlayer = new GamePlayer("郑印");
        DynamicProxyHandle dynamicProxyHandle = new DynamicProxyHandle(iGamePlayer);
        IGamePlayer proxy = (IGamePlayer) Proxy
                .newProxyInstance(iGamePlayer.getClass().getClassLoader(), iGamePlayer.getClass().getInterfaces(), dynamicProxyHandle);
        proxy.login("zhengyin", "134138");
        proxy.killBoss();
        proxy.upgrade();
    }
}
