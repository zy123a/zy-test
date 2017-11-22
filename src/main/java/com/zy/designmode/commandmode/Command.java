package com.zy.designmode.commandmode;

/**
 * Desc: 命令中封装了接受者和动作
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/7/11
 * Time:19:41
 */
public interface Command {
    void excute();

    void undo();
}
