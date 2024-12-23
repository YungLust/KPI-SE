package Buildings;

public class House extends Buildings {
    char symbol = '■';

    public House(int width, int height) {
        super(width, height);
    }

    @Override
    public char getSymbol() {
        return symbol;
    }
}
