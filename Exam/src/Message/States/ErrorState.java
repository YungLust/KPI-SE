package Message.States;

import Message.Message;

public class ErrorState implements State{
    @Override
    public void checkStatus(Message message) {
        message.setState(this);
        System.out.println("Error while sending the message!");
    }
}
