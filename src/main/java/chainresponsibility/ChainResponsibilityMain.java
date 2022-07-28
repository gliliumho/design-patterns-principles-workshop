package chainresponsibility;

public class ChainResponsibilityMain {
    public static void main(String[] args){
        //more such handlers
        final EventHandler policeHandler = new CallPoliceHandler(null);
        final EventHandler burglarHandler = new BurglarAlarmEventHandler(policeHandler);
        final EventHandler fireHandler = new FireAlarmEventHandler(burglarHandler);
        final EventHandler logHandler = new LogHandler(fireHandler);
        final EventHandler emergencyHandler = new EmergencyHandler(logHandler);
        process(emergencyHandler);
    }

    private static void process(EventHandler handler){
        handler.handleEvent(EventType.BURGLAR_ALARM);
    }
}
