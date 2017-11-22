package com.zy;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/9/24
 * Time:16:02
 */
public class VMTest {
    public static void main(String[] args) {
        List<VMTest> w = new ArrayList<VMTest>();
        while (true) {
            w.add(new VMTest());
        }
    }
}

