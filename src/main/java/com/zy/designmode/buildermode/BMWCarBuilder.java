package com.zy.designmode.buildermode;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/11/28
 * Time:18:17
 */
public class BMWCarBuilder implements Builder {
    AbstractCarModel carModel;
    public AbstractCarModel buildCar() {
        carModel = new BMWCar();
        List<String> list = new ArrayList<String>();
        list.add("engine");
        list.add("horn");
        list.add("start");
        list.add("stop");
        carModel.setList(list);
        return carModel;
    }
}

