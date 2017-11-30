package com.zy.test;

import com.zy.beans.Student;
import com.zy.controller.TestController;
import com.zy.inferance.StudentInferace;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2017/11/24
 * Time:12:06
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath:application.xml","classpath:springmvc-servlet.xml"})
@Slf4j
public class JunitTest {
    @Autowired
    private StudentInferace studentInferace;
    @Autowired
    private TestController testController;
    private MockMvc mockMvc;

    @Before
    public void init() {
        mockMvc = MockMvcBuilders.standaloneSetup(testController).build();
    }

    @org.junit.Test
    public void testDB() {
        Student student=studentInferace.selectById(1);
        System.out.println("测试结果： "+student);
    }

    @org.junit.Test
    public void testController() {
        try {
            ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/api/student").contentType(
                    MediaType.APPLICATION_JSON_UTF8).param("id", "1"));
            MvcResult result=resultActions.andDo(MockMvcResultHandlers.print()).andReturn();
//            String re = resultActions.andReturn().getResponse().getContentAsString();
//            log.info("结果："+re);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println("adfasfd");
    }
}
