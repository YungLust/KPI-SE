
public abstract class MessageDecorator implements Message {
    protected Message decoratedMessage;
    public MessageDecorator(Message decoratedMessage) {
        this.decoratedMessage = decoratedMessage;
    }
    public String send() {
        return decoratedMessage.send();
    }
}
