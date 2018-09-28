package com.zy.designmode.buildermode;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/11/28
 * Time:18:22
 */
public class BenzCarBuilder implements Builder {
    AbstractCarModel carModel;
    public AbstractCarModel buildCar() {
        carModel = new BenzCar();
        List<String> list = new ArrayList<String>();
        list.add("engine");
        list.add("start");
        list.add("horn");
        list.add("stop");
        carModel.setList(list);
        return carModel;
    }
}
