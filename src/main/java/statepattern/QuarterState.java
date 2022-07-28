package statepattern;

public class QuarterState implements State {
    @Override
    public State nextState() {
        return new HalfState();
    }
}
