package com.start.springstart.services.impl.english;

import com.start.springstart.services.RedPrinter;
import org.springframework.stereotype.Service;

@Service
public class EnglishRedPrinter implements RedPrinter {
    @Override
    public String print() {
        return "Red";
    }
}
