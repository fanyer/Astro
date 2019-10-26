package com.example.demo.controller;

import com.example.demo.beans.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting hello() {
        return new Greeting(1, "aaa");
    }
}
