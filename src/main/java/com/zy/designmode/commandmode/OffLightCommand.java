package com.zy.designmode.commandmode;

import lombok.AllArgsConstructor;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/7/11
 * Time:19:43
 */
@AllArgsConstructor
public class OffLightCommand implements Command {
    private Light light;

    public void excute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
