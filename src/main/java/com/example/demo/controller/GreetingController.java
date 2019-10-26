package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public com.example.demo.beans.GreetingController hello() {
        return new com.example.demo.beans.GreetingController(1, "aaa");
    }
}
