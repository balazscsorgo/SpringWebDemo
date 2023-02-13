package com.prog.sprintwebdemo2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

//    @GetMapping("/hello")
//    @ResponseBody
//    public String sayHello() {
//        return "Hello World!";
//    }

//http://localhost:8080/hello

    @GetMapping("/hello")
    public String sayHello() {
        return "hello-world";
    }
}
