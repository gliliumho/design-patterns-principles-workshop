package chainresponsibility;

public class CallPoliceHandler implements EventHandler {
    private final EventHandler next;

    public CallPoliceHandler(final EventHandler next) {
        this.next = next;
    }

    @Override
    public void handleEvent(final EventType eventType) {
        if (eventType == EventType.BURGLAR_ALARM || eventType == EventType.FIRE_ALARM) {
            System.out.println("Call police");
        }

        if (next != null) next.handleEvent(eventType);
    }
}
