package com.start.springstart.services.impl.english.spanish;

import com.start.springstart.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class SpanishGreenPrinter implements GreenPrinter {
    @Override
    public String print() {
        return "Verde";
    }
}
