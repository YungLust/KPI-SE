/**
 * class to add image to the message
 */
public class ImageDecorator extends MessageDecorator {
    String image;

    /**
     * @param decoratedMessage is message we want to add image to
     * @param image            is image to add to the message
     */
    public ImageDecorator(Message decoratedMessage, String image) {
        super(decoratedMessage);
        this.image = image;
    }

    /**
     * @return It returns the content of taken message and adds image to it
     */
    @Override
    public String send() {
        return super.send() + "\nSending image: " + image;
    }
}
