package mediatorpattern;

public interface ChatServer {
    void register(User user);
    void sendMessage(User sender, String receiverName, String message);
}
