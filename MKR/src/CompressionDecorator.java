public class CompressionDecorator extends MessageDecorator {
    private String key;

    public CompressionDecorator(Message decoratedMessage, String key) {
        super(decoratedMessage);
        this.key = key;
    }

    @Override
    public String send() {
        String text = super.send();
        return text.replace(" ", key);
    }
}
