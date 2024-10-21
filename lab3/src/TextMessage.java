/**
 * Standart class for message with text
 */
public class TextMessage implements Message {

    private String text;

    /**
     * @param text is text that we add to message
     */
    public TextMessage(String text) {
        this.text = text;
    }

    /**
     * @return In send method it just returns text
     */
    @Override
    public String send() {
        return text;
    }
}
