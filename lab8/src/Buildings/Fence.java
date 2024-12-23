package Buildings;

public class Fence extends Buildings {
    char symbol = '+';

    public Fence(int width, int height) {
        super(width, height);
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

}
