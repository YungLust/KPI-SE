public class FileDecorator extends MessageDecorator {
    private String file;

    public FileDecorator(Message decoratedMessage, String file) {
        super(decoratedMessage);
        this.file = file;
    }

    @Override
    public String send() {
        return super.send() + "\nSending file: " + file;
    }
}
