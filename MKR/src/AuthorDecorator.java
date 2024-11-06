public class AuthorDecorator extends MessageDecorator {
    String Author;

    public AuthorDecorator(Message decoratedMessage, String Author) {
        super(decoratedMessage);
        this.Author = Author;
    }

    @Override
    public String send() {
        return super.send() + "\n\t by " + Author;
    }
}
