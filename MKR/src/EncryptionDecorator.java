public class EncryptionDecorator extends MessageDecorator {
    private int step;

    public EncryptionDecorator(Message decoratedMessage, int step) {
        super(decoratedMessage);
        this.step = step;
    }

    private String caesarCipher() {
        //System.out.println("Using Caesar cipher with step: " + step);
        return "Encrypted!\n" + super.send();
    }

    @Override
    public String send() {
        return caesarCipher();
    }
}
