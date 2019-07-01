package edu.springguru.dicommon.controllers;

import edu.springguru.dicommon.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello world!!!");
        return greetingService.sayGreetings();
    }
}
