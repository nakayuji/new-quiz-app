package com.example.newquizapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewQuizAppController {

    @GetMapping("/show")
    public String show(){
        return "Hello World";
    }
}
