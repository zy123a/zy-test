package com.zy.designmode.factoryMothodMode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/11/24
 * Time:11:05
 */
public class TestClient {
    public static void main(String[] args) {
        AbstractFactory factory = new ConcreteFactory();
        Product product = factory.createProduct(ConcreteProduct1.class);
        product.doSomething();
    }
}
