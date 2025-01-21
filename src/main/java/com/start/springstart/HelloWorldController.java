package com.start.springstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Hello from method";
    }

    @GetMapping(path = "/test")
    public String test() {
        return "Hello from test method";
    }
}
