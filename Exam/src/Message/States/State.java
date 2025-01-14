package Message.States;

import Message.Message;

public interface State {
    void checkStatus(Message message);
}
