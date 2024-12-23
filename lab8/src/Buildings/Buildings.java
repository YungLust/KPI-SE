package Buildings;

public abstract class Buildings {
    int width;
    int height;

    public Buildings(int width, int height) {
        this.width = width;
        this.height = height;
    }

    abstract public char getSymbol();

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
