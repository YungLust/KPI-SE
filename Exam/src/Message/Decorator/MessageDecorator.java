package Message.Decorator;

import Message.Message;

abstract class MessageDecorator extends Message {
    protected Message message;

    public MessageDecorator(Message message) {
        super(message.getText());
        this.message = message;
    }

    @Override
    public String getText() {
        return message.getText();
    }
}
