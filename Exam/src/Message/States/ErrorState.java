package Message.States;

import Message.Message;

public class ErrorState implements State{
    @Override
    public void getInfo() {
        System.out.println("—— Error while sending the message! ——");
    }
}
