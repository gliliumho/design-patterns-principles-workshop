package chainresponsibility;

public class FireAlarmEventHandler implements EventHandler{
    private final EventHandler next;

    public FireAlarmEventHandler(final EventHandler next) {
        this.next = next;
    }

    @Override
    public void handleEvent(final EventType eventType) {
        if(eventType == EventType.FIRE_ALARM){
            System.out.println("Call fire fighter");
        }

        //if(condition) { return; }
        //if(condition) _next1.HandleEvent(eventType)
        //else _next2.HandleEvent(eventType)
        if (next != null) next.handleEvent(eventType);
    }
}
