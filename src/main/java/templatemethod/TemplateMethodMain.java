package templatemethod;

public class TemplateMethodMain {

    public static void main(String args[]) {
        Document document = new TextDocument();
        process(document);

        document = new XMLDocument();
        process(document);
    }

    private static void process(final Document doc) {
        doc.print();
    }
}
