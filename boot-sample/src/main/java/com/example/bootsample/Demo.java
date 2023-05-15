package com.example.bootsample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @RequestMapping("Welcome")
    public String msg(){
        return "Welcome to EY GDS";
    }
}
