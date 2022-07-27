package templatemethod;

public abstract class Document {
    public void print() {
        printHeader();
        printBody();
        printFooter();
    }

    public void printReverse() {
        printFooter();
        printBody();
        printHeader();
    }

    protected abstract void printHeader();

    protected abstract void printBody();

    protected abstract void printFooter();
}
