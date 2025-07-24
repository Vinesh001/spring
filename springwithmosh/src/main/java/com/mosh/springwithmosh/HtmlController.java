package com.mosh.springwithmosh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HtmlController {

    @RequestMapping("/")
    public String random() {
        return "hello.html";
    }
    
}
