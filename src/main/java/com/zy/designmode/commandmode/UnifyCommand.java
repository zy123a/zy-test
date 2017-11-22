package com.zy.designmode.commandmode;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/7/12
 * Time:18:15
 */
public class UnifyCommand implements Command {
    List<Command> commands = new ArrayList<Command>();

    public void setCommand(Command command) {
        commands.add(command);
    }
    public void excute() {
        for(Command command : commands) {
            command.excute();
        }
    }

    public void undo() {
        for(Command command : commands) {
            command.undo();
        }
    }
}

