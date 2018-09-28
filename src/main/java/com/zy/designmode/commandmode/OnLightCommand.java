package com.zy.designmode.commandmode;

import lombok.AllArgsConstructor;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/7/11
 * Time:19:54
 */
@AllArgsConstructor
public class OnLightCommand implements Command {

    Light light;

    public void excute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
