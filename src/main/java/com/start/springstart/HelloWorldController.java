package com.start.springstart;

import com.start.springstart.services.ColorPrinter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/print")
    public String helloWorld() {
        ColorPrinter colorPrinter = new ColorPrinterImpl();
        return colorPrinter.print();
    }

    @GetMapping(path = "/test")
    public String test() {
        return "Hello from test method";
    }
}
