package decorator;

public class CompressionNetwork extends NetworkDecorator {
    public CompressionNetwork(Network network) {
        super(network);
    }

    @Override
    public void send(final String message) {
        final String compressedMessage = compress(message);
        super.send(compressedMessage);
    }

    private String compress(final String message) {
        return "compressed " + message;
    }
}
