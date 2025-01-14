package Message.States;

import Message.Message;

public class DeliveredState implements State{
    @Override
    public void getInfo() {
        System.out.println("—— Message is delivered to user! ——");
    }
}
