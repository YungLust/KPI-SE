public class CompressionDecorator extends MessageDecorator {

    public CompressionDecorator(Message decoratedMessage) {
        super(decoratedMessage);
    }

    private String compress(){
        return super.send() + "\nCompressed!";
    }

    @Override
    public String send() {
        return compress();
    }
}
