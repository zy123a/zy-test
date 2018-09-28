package com.zy.designmode.commandmode;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/7/12
 * Time:18:09
 */
public class Test {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new DropLight();
        Fan fan = new DropFan();
        // 设置电灯控制命令
        control.setCommands(0,new OffLightCommand(light),new OnLightCommand(light));
        // 设置电扇控制命令
        control.setCommands(1, new OffFanCommand(fan), new OnFanCommand(fan));
        // 设置统一命令
        UnifyCommand onUnifyCommand = new UnifyCommand();
        onUnifyCommand.setCommand(new OnLightCommand(light));
        onUnifyCommand.setCommand(new OnFanCommand(fan));
        UnifyCommand offUnifyCommand2 = new UnifyCommand();
        offUnifyCommand2.setCommand(new OffLightCommand(light));
        offUnifyCommand2.setCommand(new OffFanCommand(fan));
        control.setCommands(2, offUnifyCommand2, onUnifyCommand);

        //打开电灯
        control.onLightButton();
        //打开电扇
        control.onFanButton();
        //同时关闭电灯电扇
        control.unifyOffButton();
        //撤销上次动作
        control.revocation();

    }
}
