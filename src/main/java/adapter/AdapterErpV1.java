package adapter;

public class AdapterErpV1 implements Erp {
    private final ErpV1 erp = new ErpV1();

    @Override
    public void send(int para1, int para2) {
        erp.send(para1, para2);
    }
}
