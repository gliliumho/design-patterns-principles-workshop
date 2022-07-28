package statepattern;

public class Bulb {
    private State currentState = new OffState();

    public void touch() {
        currentState = currentState.nextState();
    }

    public void printState(){
        System.out.println("Current state: " + currentState.getClass().getSimpleName());
    }
}
