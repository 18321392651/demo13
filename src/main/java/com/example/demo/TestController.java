package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mr.DuanDeWen
 * @create: 2019-03-19 17:45
 **/
@RestController
public class TestController {

    @RequestMapping("/test")
    public String ddw(){
        return "123";
    }
}
