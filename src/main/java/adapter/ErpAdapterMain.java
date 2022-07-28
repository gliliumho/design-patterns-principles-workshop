package adapter;

public class ErpAdapterMain {

    public static void main(String[] args) {
        final Erp adapter = createAdapter();
        process(adapter);
    }

    public static Erp createAdapter() {
        return new AdapterErpV1();
    }

    private static void process(Erp erp) {
        erp.send(100, 200);
    }
}


