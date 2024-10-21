/**
 * class to add audio to the message
 */
public class AudioDecorator extends MessageDecorator {
    private String audio;

    /**
     * @param decoratedMessage is message we want to add audio to
     * @param audio            is audio to add to the message
     */
    public AudioDecorator(Message decoratedMessage, String audio) {
        super(decoratedMessage);
        this.audio = audio;
    }

    /**
     * @return It returns the content of taken message and adds audio to it
     */
    @Override
    public String send() {
        return super.send() + "\nSending audio: " + audio;
    }
}
