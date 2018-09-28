package com.zy.designmode.factoryMothodMode;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/11/24
 * Time:10:56
 */
public abstract class AbstractFactory {
    public abstract <T extends Product> T createProduct(Class<T> name);
}
