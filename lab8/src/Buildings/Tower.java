package Buildings;

public class Tower extends Buildings {
    char symbol = '*';

    public Tower(int width, int height) {
        super(width, height);
    }

    @Override
    public char getSymbol() {
        return symbol;
    }
}
