package chainresponsibility;

public class LogHandler implements EventHandler {
    private final EventHandler next;

    public LogHandler(final EventHandler next) {
        this.next = next;
    }

    @Override
    public void handleEvent(final EventType eventType) {
        //log event
        if (next != null) next.handleEvent(eventType);
    }
}
