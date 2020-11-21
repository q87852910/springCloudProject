package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class Controller {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String get(){
        return "string";
    }
}
