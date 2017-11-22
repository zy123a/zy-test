package com.zy.designmode.observermode;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/7/2
 * Time:22:02
 */
public class StaticsDisplay implements Observer<Weather> {
    private Subject subject;

    public StaticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void updata(Weather weather) {
        System.out.println(this.getClass() + "输出天气预报：" + weather.toString());
    }
}

