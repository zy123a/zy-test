package com.zy.designmode.proxy.forceProxy;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/10/19
 * Time:16:12
 */
public class GamePlayerV2 implements IGamePlayerV2 {
    private IGamePlayerV2 gamePlayerV2;
    private String name;

    public GamePlayerV2(String name) {
        this.name = name;
    }

    public void login(String user, String password) {
        if (gamePlayerV2 != null) {
            System.out.println("登录名为" + user + "的用户" + this.name + "登录成功");
        } else {
            System.out.println("请用指定代理访问");
        }

    }

    public void killBoss() {
        if (gamePlayerV2 != null) {
            System.out.println(this.name + "在打怪");
        } else {
            System.out.println("请用指定代理访问");
        }

    }

    public void upgrade() {
        if (gamePlayerV2 != null) {
            System.out.println(this.name + "在升级");
        } else {
            System.out.println("请用指定代理访问");
        }
    }

    public IGamePlayerV2 getProxy() {
        this.gamePlayerV2 = new GamePlayerV2Proxy(this);
        return this.gamePlayerV2;
    }
}
