package chainresponsibility;

public class EmergencyHandler implements EventHandler {
    private final EventHandler next;

    public EmergencyHandler(final EventHandler eventHandler) {
        this.next = eventHandler;
    }

    @Override
    public void handleEvent(EventType eventType) {
        if (eventType == EventType.BURGLAR_ALARM || eventType == EventType.FIRE_ALARM) {
            System.out.println("Call 999");
        }

        if (next != null) next.handleEvent(eventType);
    }
}
