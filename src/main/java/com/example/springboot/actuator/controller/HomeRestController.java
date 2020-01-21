package com.example.springboot.actuator.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {
	
	@GetMapping("/welcome")
    public String example() {
        return "You are welcome at " + new Date();
    }

}
