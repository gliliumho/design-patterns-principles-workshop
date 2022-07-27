package templatemethod;

public class TextDocument extends Document {

    @Override
    protected void printHeader() {
        System.out.println("Text header");
    }

    @Override
    protected void printBody() {
        System.out.println("Text body");
    }

    @Override
    protected void printFooter() {
        System.out.println("Text footer");
    }
}
