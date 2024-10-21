/**
 * Abstract class needed for other message decorators<br>
 * It aggregates {@link Message Message} interface to use {@link Message#send send()} method in different decorators<br>
 * Using {@link Message#send send()} method to add some content to the current message
 */
public abstract class MessageDecorator implements Message {
    /**
     * We use protected so only decorators that exetends this class
     * can use decoratedMessage and its method {@link Message#send send()}
     */
    protected Message decoratedMessage;

    /**
     * @param decoratedMessage some class that implements {@link Message Message} interface.
     *                         So it must have declared {@link Message#send send()} method
     */

    public MessageDecorator(Message decoratedMessage) {
        this.decoratedMessage = decoratedMessage;
    }

    /**
     * @return It returns content of the current message
     */
    public String send() {
        return decoratedMessage.send();
    }
}
