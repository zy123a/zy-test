package com.zy.designmode.commandmode;

import lombok.AllArgsConstructor;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/7/11
 * Time:19:58
 */
@AllArgsConstructor
public class OffFanCommand implements Command {

    private Fan fan;

    public void excute() {
        fan.off();
    }

    public void undo() {
        fan.on();
    }
}
