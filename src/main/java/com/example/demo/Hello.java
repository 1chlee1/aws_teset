package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/")
    public String index() {
        return "Hello World!";
    }

    @RequestMapping("test")
    public String index1() {
        return "";
    }

    @RequestMapping("/aaa")
    public String index2(){
        return "this is aaa";
    }

    @RequestMapping("/user")
    public String user(@RequestBody String number) {
        number=number+"@@";
        System.out.println(number);
        return number;
    }
}



