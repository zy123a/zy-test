package com.zy.designmode.observermode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/7/2
 * Time:21:51
 */
public interface Observer<T> {
    void updata(T t);
}
