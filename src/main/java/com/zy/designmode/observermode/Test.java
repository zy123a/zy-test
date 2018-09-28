package com.zy.designmode.observermode;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/7/2
 * Time:22:06
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new SecondDisplay(weatherData);
        new StaticsDisplay(weatherData);
        weatherData.measurementChange();
    }
}
