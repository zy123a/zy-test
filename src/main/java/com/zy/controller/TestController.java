package com.zy.controller;

import com.zy.beans.Student;
import com.zy.inferance.StudentInferace;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2016/12/30
 * Time:11:25
 */
@Controller
@Slf4j
public class TestController {
    @Autowired
    private StudentInferace studentInferace;

    @RequestMapping(value = "/api/zy", produces = "text/html;charset=UTF-8")
    public String getHead() {
        log.info("郑印log");
        return "go";
    }

    @RequestMapping(value = "/api/student")
    @ResponseBody
    public Student getStudent() {
        Student student=studentInferace.selectById(1);
        return student;
    }


    @RequestMapping(value = "/api/student/name")
    @ResponseBody
    public List<Student> getStudentByName() {
        List<Student> students=studentInferace.getStudentByName("");
        return students;
    }
    @RequestMapping(value = "/api/student/map")
    @ResponseBody
    public List<Student> getStudentByMap() {
        Map<String,String> map = new HashMap();
        map.put("name","z");
        map.put("phone","123");
        List<Student> students=studentInferace.getStudentByMap(map);
        return students;
    }

    @RequestMapping(value = "/api/student/phone")
    @ResponseBody
    public List<Student> getStudentByPhone() {
        List<Student> students=studentInferace.getStudentByPhone("123");
        return students;
    }

    @RequestMapping(value = "/api/student/insert")
    @ResponseBody
    public int insertStudent() {
        Student student=new Student();
        student.setName("cheng");
        student.setPhone("155714");
        int id=studentInferace.insertStudent(student);
        return id;
    }

}
