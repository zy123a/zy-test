package com.zy.designmode.observermode;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/7/2
 * Time:21:54
 */
public class WeatherData implements Subject<Weather> {
    List<Observer> observerList = new ArrayList<Observer>();
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if (index >= 0) {
            observerList.remove(index);
        }
    }

    public void notifyObserver(Weather weather) {
        for(Observer observer : observerList) {
            observer.updata(weather);
        }
    }

    public void measurementChange() {
        Weather weather = new Weather(12, 13, 14);
        notifyObserver(weather);
    }


}
