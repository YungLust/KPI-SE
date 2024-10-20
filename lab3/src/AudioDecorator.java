public class AudioDecorator extends MessageDecorator {
    private String audio;

    public AudioDecorator(Message decoratedMessage, String audio) {
        super(decoratedMessage);
        this.audio = audio;
    }

    @Override
    public String send() {
        return super.send() + "\nSending audio: " + audio;
    }
}
