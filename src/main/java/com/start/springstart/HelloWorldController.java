package com.start.springstart;

import com.start.springstart.services.ColorPrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
   @Autowired
   private ColorPrinter colorPrinter;


    @GetMapping(path = "/hello")
    public String helloWorld() {
        return colorPrinter.print();
    }

    @GetMapping(path = "/test")
    public String test() {
        return "Hello from test method";
    }
}
