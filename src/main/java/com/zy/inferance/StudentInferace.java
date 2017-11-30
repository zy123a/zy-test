package com.zy.inferance;

import com.zy.beans.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/4/12
 * Time:11:19
 */
public interface StudentInferace {
    public Student selectById(int id);

    public List<Student> getStudentByName(@Param("name") String name);

    public List<Student> getStudentByMap(Map map);

    public List<Student> getStudentByPhone(@Param("phone") String phone);

    public int insertStudent(Student student);

}
