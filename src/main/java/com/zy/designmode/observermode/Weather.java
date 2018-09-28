package com.zy.designmode.observermode;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/7/2
 * Time:22:00
 */
@Data
@AllArgsConstructor
public class Weather {
    private double temperature;
    private double humidity;
    private double pressure;
}
