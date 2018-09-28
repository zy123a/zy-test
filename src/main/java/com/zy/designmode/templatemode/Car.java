package com.zy.designmode.templatemode;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/7/23
 * Time:18:32
 */
public abstract class Car {
    public void templateMethod() {
        start();
        stop();
    }

    protected abstract void stop();

    public abstract void start();
}
