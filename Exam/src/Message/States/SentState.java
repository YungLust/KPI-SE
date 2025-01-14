package Message.States;


import Message.Message;

public class SentState implements State {
    @Override
    public void getInfo() {
        System.out.println("—— Notification has been sent to user! ——");
    }
}