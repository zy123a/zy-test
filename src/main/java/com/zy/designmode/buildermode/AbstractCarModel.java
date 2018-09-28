package com.zy.designmode.buildermode;

import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Desc:模板模式
 * ------------------------------------
 * Author:XXX
 * Date:2017/11/28
 * Time:10:51
 */
public abstract class AbstractCarModel {

    private List<String> list;

    public void run() {
        if (CollectionUtils.isEmpty(list)) {
            return;
        }
        for(String str : list) {
            if (str.equals("engine")) {
                this.engine();
            }
            if (str.equals("horn")) {
                this.horn();
            }
            if (str.equals("start")) {
                this.start();
            }
            if (str.equals("stop")) {
                this.stop();
            }
        }
    }

    protected abstract void engine();

    protected abstract void horn();

    protected abstract void start();

    protected abstract void stop();

    protected void setList(List list) {
        this.list = list;
    }

}
