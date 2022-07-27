package decorator;

public class NetworkDecoratorMain {

    public static void main(String[] args) {
        final BasicNetwork basicNetwork = new BasicNetwork();
        final NetworkDecorator compressionNetwork = new CompressionNetwork(basicNetwork);
        process(compressionNetwork);

        final NetworkDecorator encryptionNetwork = new EncryptionNetwork(basicNetwork);
        process(encryptionNetwork);

        final NetworkDecorator compressedEncryptedNetwork = new CompressionNetwork(encryptionNetwork);
        process(compressedEncryptedNetwork);
    }

    private static void process(Network network){
        network.send("KY");
    }
}
