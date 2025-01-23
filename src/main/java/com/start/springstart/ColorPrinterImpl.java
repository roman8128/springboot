package com.start.springstart;

import com.start.springstart.services.BluePrinter;
import com.start.springstart.services.ColorPrinter;
import com.start.springstart.services.GreenPrinter;
import com.start.springstart.services.RedPrinter;
import com.start.springstart.services.impl.EnglishBluePrinter;
import com.start.springstart.services.impl.EnglishGreenPrinter;
import com.start.springstart.services.impl.EnglishRedPrinter;

public class ColorPrinterImpl implements ColorPrinter {
    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;

    public ColorPrinterImpl() {
        this.redPrinter = new EnglishRedPrinter();
        this.greenPrinter = new EnglishGreenPrinter();
        this.bluePrinter = new EnglishBluePrinter();
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), greenPrinter.print(), bluePrinter.print());
    }
}
