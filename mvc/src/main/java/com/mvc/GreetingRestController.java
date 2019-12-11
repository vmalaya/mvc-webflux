package com.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {

    @RequestMapping("/greeting")
    public Greeting getGreeting() {
        return new Greeting("Hello!");
    }
}
