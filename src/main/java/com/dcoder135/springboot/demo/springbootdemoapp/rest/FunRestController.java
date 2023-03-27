package com.dcoder135.springboot.demo.springbootdemoapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

//    inject properties for coach.name and team using the @Value annotation

    @Value("$coach.name")
    private String coachName;

    @Value("$team.name")
    private String teamName;

//    expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    //    expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Do 40 push-ups in a single go.";
    }

    //    expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day!";
    }
}
