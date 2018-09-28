package com.zy.designmode.observermode;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/7/2
 * Time:22:04
 */
public class SecondDisplay implements Observer<Weather> {
    private Subject subject;

    public SecondDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void updata(Weather weather) {
        System.out.println(this.getClass() + "输出天气预报：" + weather.toString());
    }
}
