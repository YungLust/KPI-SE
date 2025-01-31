package Message;

import Message.States.NewState;
import Message.States.State;

public class Message {
    private String text;
    private State state;

    public Message(String text){
        this.text = text;
        this.state = new NewState();
    }

    public void checkState(){
        System.out.print("Checking message state: ");
        state.getInfo();
    }

    public String getText() {
        return text;
    }


    public void setState(State state) {
        this.state = state;
    }
}
