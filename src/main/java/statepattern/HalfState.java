package statepattern;

public class HalfState implements State {
    @Override
    public State nextState() {
        return new AlmostFullState();
    }
}
