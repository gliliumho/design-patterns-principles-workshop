package adapter;

// Erp V2===============================
public class AdapterErpV2 implements Erp {
    private ErpV2 erp = new ErpV2();

    @Override
    public void send(int para1, int para2) {
        final String xml = toXml(para1, para2);
        erp.Send(xml);
    }

    private String toXml(int para1, int para2) {
        //prepare xml from parameters
        return String.format("%d and %d", para1, para2);
    }
}
