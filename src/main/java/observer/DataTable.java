package observer;

public class DataTable extends Observable {
    private String data;
    private boolean refreshSuspended = false;

    public DataTable(final String data) {
        this.data = data;
    }

    public boolean setRefreshSuspended(boolean refreshSuspended) {
        this.refreshSuspended = refreshSuspended;
        return this.refreshSuspended;
    }

    public boolean getRefreshSuspended() {
        return this.refreshSuspended;
    }

    public String getData() {
        return data;
    }

    public void setData(final String data) {
        this.data = data;
        if (!this.refreshSuspended) {
            refreshAll();
        }
    }
}
