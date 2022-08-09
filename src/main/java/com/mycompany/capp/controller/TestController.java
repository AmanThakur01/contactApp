package com.mycompany.capp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author aman
 */
@Controller
public class TestController {
    
    @RequestMapping("/test/hello")
    public String helloWorld(){
        return "hello";///WEB_INF/view/hello.jsp
    }
}
