package decorator;

public class BasicNetwork implements Network {
    @Override
    public void send(String message) {
        System.out.println("Message sent: " + message);
    }
}
