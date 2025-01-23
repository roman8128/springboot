package com.start.springstart;

import com.start.springstart.services.BluePrinter;
import com.start.springstart.services.ColorPrinter;
import com.start.springstart.services.GreenPrinter;
import com.start.springstart.services.RedPrinter;

public class ColorPrinterImpl implements ColorPrinter {
    private final RedPrinter redPrinter;
    private final GreenPrinter greenPrinter;
    private final BluePrinter bluePrinter;

    public ColorPrinterImpl(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter) {
        this.redPrinter = redPrinter;
        this.greenPrinter = greenPrinter;
        this.bluePrinter = bluePrinter;
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), greenPrinter.print(), bluePrinter.print());
    }
}
