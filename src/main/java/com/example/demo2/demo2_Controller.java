package com.example.demo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class demo2_Controller {
    @RequestMapping(value="")
    private String hello(){
        return "/index.html";
    }
}
