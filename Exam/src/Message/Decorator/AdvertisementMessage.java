package Message.Decorator;

import Message.Message;

public class AdvertisementMessage extends MessageDecorator {

    String adText;

    public AdvertisementMessage(Message message, String adText) {
        super(message);
        this.adText = adText;
    }

    @Override
    public String getText() {
        return super.getText() + "\n Advertisement just for you: " + adText;
    }

}
