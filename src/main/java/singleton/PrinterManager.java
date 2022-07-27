package singleton;

import com.google.common.collect.ImmutableList;

import java.util.List;

public class PrinterManager {
    private int printerIndex = 0;
    private final List<Printer> printerList = ImmutableList.of(
            new Printer("printer1"),
            new Printer("printer2"),
            new Printer("printer3"));

    public PrinterManager() {
    }

    public void print(Document doc) {
        this.printerList.get(printerIndex).print(doc);
        printerIndex++;
        if (printerIndex == printerList.size()) {
            printerIndex = 0;
        }
    }
}
