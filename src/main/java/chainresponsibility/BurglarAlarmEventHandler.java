package chainresponsibility;

public class BurglarAlarmEventHandler implements EventHandler{
    private final EventHandler next;

    public BurglarAlarmEventHandler(final EventHandler next) {
        this.next = next;
    }

    @Override
    public void handleEvent(final EventType eventType) {
        if(eventType == EventType.BURGLAR_ALARM){
            //call admin
            System.out.println("Call admin");
        }

        if (next != null) next.handleEvent(eventType);
    }
}
