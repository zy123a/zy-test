package com.zy.designmode.commandmode;

import lombok.AllArgsConstructor;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/7/11
 * Time:20:06
 */
@AllArgsConstructor
public class OnFanCommand implements Command {

    private Fan fan;

    public void excute() {
        fan.on();
    }

    public void undo() {
        fan.off();
    }
}
