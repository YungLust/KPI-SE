public class ImageDecorator extends MessageDecorator {
    String image;

    public ImageDecorator(Message decoratedMessage, String image) {
        super(decoratedMessage);
        this.image = image;
    }

    @Override
    public String send() {
        return super.send() + "\nSending image: " + image;
    }
}
