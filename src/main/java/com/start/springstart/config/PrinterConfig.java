package com.start.springstart.config;

import com.start.springstart.ColorPrinterImpl;
import com.start.springstart.services.BluePrinter;
import com.start.springstart.services.ColorPrinter;
import com.start.springstart.services.GreenPrinter;
import com.start.springstart.services.RedPrinter;
import com.start.springstart.services.impl.english.spanish.SpanishBluePrinter;
import com.start.springstart.services.impl.english.spanish.SpanishGreenPrinter;
import com.start.springstart.services.impl.english.spanish.SpanishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public RedPrinter redPrinter() {
        return new SpanishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new SpanishGreenPrinter();

    }

    @Bean
    public BluePrinter bluePrinter() {
        return new SpanishBluePrinter();
    }

    @Bean
    public ColorPrinter colorPrinter(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
        return new ColorPrinterImpl(redPrinter, greenPrinter, bluePrinter);
    }
}
