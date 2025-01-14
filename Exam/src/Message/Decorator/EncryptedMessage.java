package Message.Decorator;

import Message.Message;

public class EncryptedMessage extends MessageDecorator {

    public EncryptedMessage(Message message){
        super(message);
    }

    @Override
    public String getText() {
        return "Encrypted: " + super.getText();
    }
}
