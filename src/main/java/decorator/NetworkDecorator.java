package decorator;

public abstract class NetworkDecorator implements Network{

    private final Network network;

    public NetworkDecorator(final Network network) {
        this.network = network;
    }

    @Override
    public void send(final String message) {
        network.send(message);
    }
}
