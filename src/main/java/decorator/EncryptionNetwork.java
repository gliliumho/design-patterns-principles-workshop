package decorator;

public class EncryptionNetwork extends NetworkDecorator{
    public EncryptionNetwork(Network network) {
        super(network);
    }

    @Override
    public void send(final String message) {
        final String encryptedMessage = encrypt(message);
        super.send(encryptedMessage);
    }

    private String encrypt(final String message) {
        return "encrypted " + message;
    }
}
