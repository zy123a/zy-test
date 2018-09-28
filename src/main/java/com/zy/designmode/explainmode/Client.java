package com.zy.designmode.explainmode;

import java.util.HashMap;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2018/4/7
 * Time:22:22
 */
public class Client {
    public static void main(String[] args) {
        String str = "a+b-c";
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 2);
        hashMap.put("b", 2);
        hashMap.put("c", 1);
        Caculate caculate = new Caculate(str);
        System.out.println(caculate.run(hashMap));

    }
}
