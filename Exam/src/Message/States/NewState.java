package Message.States;

import Message.Message;

public class NewState implements State{
    @Override
    public void getInfo() {
        System.out.println("—— Notification is newly created. ——");
    }
}
