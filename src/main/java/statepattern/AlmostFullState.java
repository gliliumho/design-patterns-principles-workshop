package statepattern;

public class AlmostFullState implements State {
    @Override
    public State nextState() {
        return new FullState();
    }
}
