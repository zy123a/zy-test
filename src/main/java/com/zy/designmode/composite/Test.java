package com.zy.designmode.composite;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/8/6
 * Time:15:57
 */
public class Test {
    public static void main(String[] args) {
        MenuComponent allMenu = new Menu();
        MenuComponent breakFast = new Menu();
        MenuComponent lunch = new Menu();
        MenuComponent tiandian = new Menu();
        allMenu.add(breakFast);
        allMenu.add(lunch);
        lunch.add(tiandian);
        breakFast.add(new MenuItem("油条"));
        breakFast.add(new MenuItem("稀饭"));
        lunch.add(new MenuItem("牛肉盖饭"));
        lunch.add(new MenuItem("黄焖鸡"));
        tiandian.add(new MenuItem("雪糕"));
        tiandian.add(new MenuItem("冰淇淋"));
        Waitress waitress = new Waitress(allMenu);
        waitress.print();
    }
}
