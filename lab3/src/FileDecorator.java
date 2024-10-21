/**
 * class to add file to the message
 */
public class FileDecorator extends MessageDecorator {
    private String file;

    /**
     * @param decoratedMessage is message we want to add file to
     * @param file             is file to add to the message
     */
    public FileDecorator(Message decoratedMessage, String file) {
        super(decoratedMessage);
        this.file = file;
    }

    /**
     * @return It returns the content of taken message and adds file to it
     */
    @Override
    public String send() {
        return super.send() + "\nSending file: " + file;
    }
}
