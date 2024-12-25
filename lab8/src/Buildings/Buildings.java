package Buildings;

/**
 * abstract class for any kind of buildings.
 * Buildings are objects that can be placed on {@link GameZone GameZone}
 * Buildings can have different width/height and visual representation
 */
public abstract class Buildings {
    /**
     * width is area that occurs building horizontally
     */
    int width;
    /**
     * height is area that occurs building vertically
     */
    int height;

    /**
     * constructs object with specified width and height
     * @param width is object`s width
     * @param height is object`s height
     */
    public Buildings(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * method to get symbol of the building.
     * Symbol is visual representation of the building
     * @return char value that can be put on GameZone
     */
    abstract public char getSymbol();

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
