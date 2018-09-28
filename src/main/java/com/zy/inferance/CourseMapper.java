package com.zy.inferance;

import com.zy.beans.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Desc:
 * ------------------------------------
 * Author:XXX
 * Date:2017/4/27
 * Time:15:45
 */
public interface CourseMapper {
    public List<Course> getCourseByStudentId(@Param("studentId") String studentId);
}
