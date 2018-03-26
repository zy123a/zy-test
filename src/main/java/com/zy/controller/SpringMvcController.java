package com.zy.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Desc:
 * ------------------------------------
 * Author:zhengyin@meituan.com
 * Date:2018/2/6
 * Time:10:37
 */
@Controller
@Slf4j
public class SpringMvcController implements EnvironmentAware{

    @RequestMapping(value = "/api/envir", produces = "text/html;charset=UTF-8")
    public String getHead(Model model) {
        model.addAttribute("go", "gogogo");
        return "zhengyin";
    }

    private Environment environment = null;
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
