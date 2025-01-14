package User;

import Message.Message;
import Message.States.DeliveredState;

public class User implements Subscriber{
    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void update(Message message) {
        System.out.println(username+" got a message:" + message.getText());
        message.setState(new DeliveredState());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
