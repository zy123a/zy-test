package com.zy.designmode.observermode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/7/2
 * Time:21:49
 */
public interface Subject<T> {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver(T t);
}
