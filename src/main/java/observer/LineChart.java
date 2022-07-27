package observer;

public class LineChart implements Observer {
    private DataTable dataTable;

    public LineChart(final DataTable dataTable) {
        this.dataTable = dataTable;
        this.dataTable.attach(this);
    }

    @Override
    public void refresh() {
        final String data = dataTable.getData();
        draw(data);
    }

    public void unsubscribe() {
        this.dataTable.detach(this);
        this.dataTable = null;
    }

    public void draw(final String data) {
        System.out.println("Draw line for " + data);
    }
}
