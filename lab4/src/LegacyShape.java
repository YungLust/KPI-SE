/**
 * class that represents shapes it has width and height. It is compatible with {@link LegacyShapeTool LegacyShapeTool} interface
 */
public class LegacyShape implements LegacyShapeTool {
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
    public LegacyShape(int width, int height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    /**
     * Overriding legacy interface method to build the shape on coordinates [0;0].
     */
    @Override
    public void build() {
        System.out.printf("LegacyShapeTool: Building %s (%dx%d) on [0;0] coordinates\n", name, width, height);
    }
}
