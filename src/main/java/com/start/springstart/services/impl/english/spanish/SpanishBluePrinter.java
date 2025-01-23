package com.start.springstart.services.impl.english.spanish;

import com.start.springstart.services.BluePrinter;
import org.springframework.stereotype.Service;

@Service
public class SpanishBluePrinter implements BluePrinter {
    @Override
    public String print() {
        return "Azul";
    }
}
