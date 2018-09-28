package com.zy.designmode.proxy.generalProxy;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/10/19
 * Time:10:45
 */
public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    public void login(String user, String password) {
        System.out.println("登录名为"+user+"的用户"+this.name + "登录成功");
    }

    public void killBoss() {
        System.out.println(this.name + "在打怪");
    }

    public void upgrade() {
        System.out.println(this.name + "在升级");
    }
}
