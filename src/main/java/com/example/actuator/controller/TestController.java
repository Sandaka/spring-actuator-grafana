package com.example.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sandaka Wijesinghe.
 * Date: 10/30/21
 */

@RestController
public class TestController {

    @GetMapping("/monitoring")
    public String monitor() {
        return "Hello World!";
    }
}
