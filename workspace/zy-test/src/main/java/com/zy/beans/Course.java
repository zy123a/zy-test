package com.zy.beans;

import lombok.Data;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/4/27
 * Time:15:46
 */
@Data
public class Course {
    private int id;
    private int studentId;
    private String course;
    private double core;
}
