package com.zy.designmode.proxy.forceProxy;

import com.zy.designmode.proxy.generalProxy.IGamePlayer;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/10/19
 * Time:16:09
 */
public interface IGamePlayerV2 extends IGamePlayer {
    IGamePlayerV2 getProxy();
}
