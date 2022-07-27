package templatemethod;

public class XMLDocument extends Document {
    @Override
    protected void printHeader() {
        System.out.println("XML header");
    }

    @Override
    protected void printBody() {
        System.out.println("XML body");
    }

    @Override
    protected void printFooter() {
        System.out.println("XML footer");
    }
}
