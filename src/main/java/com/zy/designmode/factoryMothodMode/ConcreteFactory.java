package com.zy.designmode.factoryMothodMode;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/11/24
 * Time:10:57
 */
public class ConcreteFactory extends AbstractFactory {

    public <T extends Product> T createProduct(Class<T> name) {
        Product product=null;
        try {
            product=(Product)Class.forName(name.getName()).newInstance();
        } catch (Exception e) {

        }
        return (T)product;
    }
}
