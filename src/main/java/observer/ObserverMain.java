package observer;

public class ObserverMain {
    public static void main(String args[]) {
        final DataTable dataTable = new DataTable("data table");
        final LineChart lineChart1 = new LineChart(dataTable);
        final LineChart lineChart2 = new LineChart(dataTable);
        final BarChart barChart1 = new BarChart(dataTable);

        dataTable.setData("New Data");
        dataTable.setRefreshSuspended(true);
        dataTable.setData("Some more");
        dataTable.setRefreshSuspended(false);
        dataTable.setData("Even more");
    }
}
