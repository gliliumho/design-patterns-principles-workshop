package statepattern;

public class FullState implements State {
    @Override
    public State nextState() {
        return new OffState();
    }
}
