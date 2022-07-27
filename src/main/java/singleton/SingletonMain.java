package singleton;

public class SingletonMain {

    public static void main(String args[]) {
        final Document doc1 = new Document("doc1");
        final Document doc2 = new Document("doc2");
        final Document doc3 = new Document("doc3");
        final Document doc4 = new Document("doc4");
        final Document doc5 = new Document("doc5");

        final PrinterManager pm = new PrinterManager();
        pm.print(doc1);
        pm.print(doc2);
        pm.print(doc3);
        pm.print(doc4);
        pm.print(doc5);
    }
}
