package singleton;

public class Printer {
    private final String name;

    public Printer(final String name) {
        this.name = name;
    }

    public void print(final Document doc) {
        System.out.println("Printing on " + this.name + ": " + doc.getData());
    }
}
