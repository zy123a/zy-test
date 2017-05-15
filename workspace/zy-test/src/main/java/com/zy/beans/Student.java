package com.zy.beans;

import lombok.Data;

import java.util.List;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/4/11
 * Time:18:20
 */
@Data
public class Student {
    private int id;
    private String name;
    private String phone;
    private List<Course> courses;
}
