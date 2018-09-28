package com.zy.designmode.proxy.generalProxy;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/10/19
 * Time:10:44
 */
public interface IGamePlayer {
//  登录
    void login(String user, String password);
//  打怪
    void killBoss();
//  升级
    void upgrade();
}
