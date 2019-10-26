package com.example.demo.beans;

import lombok.Data;

@Data
public class GreetingController {
    private final long id;
    private final String content;

    public GreetingController(long id, String content) {
        this.id = id;
        this.content = content;
    }

}
