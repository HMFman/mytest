package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "my springboot test push to remote repository!!";
    }

    @RequestMapping("/hi")
    public String hi() {
        return "Just say hi hi hi！！！";
    }

    @RequestMapping("/test")
    public String test() {
        return "test connect with open_ssl!!!";
    }
}
