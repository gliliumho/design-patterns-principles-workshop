package mediatorpattern;

public class User {
    private final ChatServer server;
    //Not allowed
    //private User anotherUser; 
    //IsActive
    public final String name;

    public User(String name, ChatServer server) {
        this.server = server;
        this.name = name;
        this.server.register(this);
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String receiverName, String message) {
        server.sendMessage(this, receiverName, message);
    }

    public void receiveMessage(String senderName, String message) {
        System.out.println(message + senderName);
    }
}
