package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(required = false, defaultValue = "Guest") String name
    ){
        return "Hello, " + name + ", Spring ";
    }

    @GetMapping("/greeting")
    public Greeting greeting(
            @RequestParam(required = false, defaultValue = "World") String content
    ) {
        return  new Greeting(1, "Hello, " + content + "!");
    }
}
