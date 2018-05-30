package com.miyazaki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/index", produces = "text/html;charset=UTF-8")
    public String index(){
        return "/WEB-INF/static/index.html";
    }
}