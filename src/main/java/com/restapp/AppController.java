package com.restapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/hello")
    public String Greeting(){

        System.out.println("Hello From RestApp");
        return "This App For Test @Sadik Algul";
    }

}
