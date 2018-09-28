package com.zy.beans;

import lombok.Data;

import java.util.List;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/4/11
 * Time:18:20
 */
@Data
public class Student {
    private int id;
    private String name;
    private String phone;
    private List<Course> courses;

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", phone='" + phone + '\'' + ", courses=" + courses
                + '}';
    }
}
