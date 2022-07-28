package statepattern;

public class OffState implements State{
    @Override
    public State nextState() {
        return new QuarterState();
    }
}
