package com.tanzi.springboot_boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringValue {
    @Value("${name}")

    private String name;
    @Value("${addr}")
    private String addr;
    @Value("${age}")
    private String age;
    @RequestMapping("/quick2")
    @ResponseBody
    public String quick2() {
        return name+"--"+age+"-----"+addr;
    }
}

