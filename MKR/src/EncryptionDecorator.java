import java.util.Arrays;

public class EncryptionDecorator extends MessageDecorator {
    private int step;

    public EncryptionDecorator(Message decoratedMessage, int step) {
        super(decoratedMessage);
        this.step = step;
    }

    private String caesarCipher() {
        String text = super.send();
        char[] textChar = text.toCharArray();
        StringBuilder changedText = new StringBuilder();
        for (char letter : textChar) {
            int changedLetter = (int) letter + step;
            letter = (char) changedLetter;
            changedText.append(letter);
        }
        return changedText.toString();
    }

    @Override
    public String send() {
        return caesarCipher();
    }
}
