package Buildings;

public class House extends Buildings {
    /**
     * Symbol is visual representation of the building
     * It is char value that can be put on GameZone
     */
    char symbol = '■';

    public House(int width, int height) {
        super(width, height);
    }

    @Override
    public char getSymbol() {
        return symbol;
    }
}
