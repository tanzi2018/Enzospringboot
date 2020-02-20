package com.tanzi.springboot_boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringBootBoot {

    @RequestMapping("/quick")
    @ResponseBody
    public String quick() {
        return "heleef3453dddd45fglo tanzi";
    }
    }

