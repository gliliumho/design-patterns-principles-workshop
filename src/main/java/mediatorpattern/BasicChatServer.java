package mediatorpattern;

import java.util.ArrayList;
import java.util.List;

public class BasicChatServer implements ChatServer {

    private List<User> users = new ArrayList<>();

    public void register(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(User sender, String receiverName, String message) {
        //log
        User receiver = users.stream()
                .filter(user -> user.getName().equals(receiverName) /* && user.IsActive */)
                .findFirst().orElse(sender);

        if (receiver != null)
            receiver.receiveMessage(sender.getName(), message);
    }

}
