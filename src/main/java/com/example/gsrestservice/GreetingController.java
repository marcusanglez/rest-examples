package com.example.gsrestservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class GreetingController {

    private static final String TEMPLATE="Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    //@RequestMapping(value="/greeting", method = RequestMethod.GET)
    public Greeting hello(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }
}
