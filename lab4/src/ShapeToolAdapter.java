/**
 * This class adapts {@link LegacyShapeTool LegacyShapeTool} interface so it can be used same way as a new one {@link ShapeTool ShapeTool} interface
 */
public class ShapeToolAdapter implements ShapeTool {
    private LegacyShapeTool legacyShape;

    /**
     * default constructor that aggregates {@link LegacyShapeTool LegacyShapeTool} interface
     * @param legacyShape object of LegacyShapeTool interface
     */
    public ShapeToolAdapter(LegacyShapeTool legacyShape) {
        this.legacyShape = legacyShape;
    }

    /**
     * Overriding method it uses legacy interface {@link LegacyShapeTool#build build()} method
     * @param x is abscissa of shape
     * @param y is ordinate of shape
     */
    @Override
    public void build(int x, int y) {
        legacyShape.build();
        System.out.printf("Moving shape vertically: %d\n",x);
        System.out.printf("Moving shape horizontally: %d\n",y);
    }
}
