package com.zy.designmode.commandmode;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/7/11
 * Time:20:10
 */
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    private Command preCommand;

    public RemoteControl() {
        onCommands = new Command[3];
        offCommands = new Command[3];
        for(Command command : offCommands) {
            command = new NoCommand();
        }
        for(Command command : onCommands) {
            command = new NoCommand();
        }
    }

    public void setCommands(int i, Command offCommand, Command onCommand) {
        onCommands[i] = onCommand;
        offCommands[i] = offCommand;
    }

    public void offLightButton() {
        offCommands[0].excute();
        preCommand=offCommands[0];
    }

    public void onLightButton() {
        onCommands[0].excute();
        preCommand = onCommands[0];
    }

    public void offFanButton() {
        offCommands[1].excute();
        preCommand = offCommands[1];
    }

    public void onFanButton() {
        onCommands[1].excute();
        preCommand = onCommands[1];
    }

    public void unifyOnButton() {
        onCommands[2].excute();
        preCommand = onCommands[2];
    }

    public void unifyOffButton() {
        offCommands[2].excute();
        preCommand = offCommands[2];
    }

    public void revocation() {
        preCommand.undo();
    }

}
