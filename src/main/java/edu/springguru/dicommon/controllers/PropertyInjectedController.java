package edu.springguru.dicommon.controllers;

import edu.springguru.dicommon.services.GreetingService;
import edu.springguru.dicommon.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreetings();
    }
}
