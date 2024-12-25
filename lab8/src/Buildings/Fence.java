package Buildings;

public class Fence extends Buildings {
    /**
     * Symbol is visual representation of the building
     * It is char value that can be put on GameZone
     */
    char symbol = '+';

    public Fence(int width, int height) {
        super(width, height);
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

}
