package mediatorpattern;

public class ChatServerMediatorMain {
    public static void main(String[] args) {
        //user code
        ChatServer server = new BasicChatServer();
        User user1 = new User("Chetan", server);
        User user2 = new User("Chirag", server);
        //X user1.SendMessage(user2, "Hi!");
        user1.sendMessage("Chirag", "Hi!");
        user2.sendMessage("Chetan", "Hi! Chetan!");
    }
}
