package observer;

public class BarChart implements Observer {
    private DataTable dataTable;

    public BarChart(DataTable dt) {
        this.dataTable = dt;
        this.dataTable.attach(this);
    }

    @Override
    public void refresh() {
        final String data = dataTable.getData();
        draw(data);
    }

    public void unsubscribe(){
        this.dataTable.detach(this);
        this.dataTable = null;
    }

    public void draw(final String data){
        System.out.println("Draw bar for " + data);
    }

}
