package com.zy.designmode.proxy.forceProxy;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/10/19
 * Time:16:20
 */
public class GamePlayerV2Proxy implements IGamePlayerV2 {

    private IGamePlayerV2 realPlayer;

    public GamePlayerV2Proxy(IGamePlayerV2 realPlayer) {
        this.realPlayer = realPlayer;
    }

    public void login(String user, String password) {
        realPlayer.login(user,password);
    }

    public void killBoss() {
        realPlayer.killBoss();
    }

    public void upgrade() {
        realPlayer.upgrade();
    }

    public IGamePlayerV2 getProxy() {
        return this;
    }
}
