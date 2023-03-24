package com.dcoder135.springboot.demo.springbootdemoapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

//    expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

//    expose a new endpoint for "workout"
    @GetMapping("/workout")

}
