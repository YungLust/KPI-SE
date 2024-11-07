/**
 * class that represents shapes it has width and height. It is compatible with {@link ShapeTool ShapeTool} interface
 */
public class Shape implements ShapeTool {
    private int width;
    private int height;
    private String name;

    /**
     * default constructor to create shapes
     *
     * @param width  shape`s width
     * @param height shape`s height
     * @param name   shape`s name
     */
    public Shape(int width, int height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    /**
     * Overriding {@link ShapeTool ShapeTool} interface method to build the shape on specific coordinates.
     */
    @Override
    public void build(int x, int y) {
        System.out.printf("ShapeTool: Building %s (%dx%d) on [%d;%d] coordinates\n", name, width, height, x, y);
    }
}
