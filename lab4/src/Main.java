/**
 * In main class we create rectangle shape and build them
 */
class Main{
    public static void main(String[] args){

        //create rectangle objects
        LegacyShape legacyRectangle = new LegacyShape(12,6, "rectangleOld");
        Shape defaultRectangle = new Shape(8,16,"rectangleNew");

        //build them
        legacyRectangle.build();
        System.out.println("*");
        defaultRectangle.build(10,10);
        System.out.println("*");
        int x = 12;
        int y = -8;
        System.out.printf("Using adapter to build legacy shape on coordinates [%d,%d]:\n\n",x,y);
        ShapeToolAdapter adapter = new ShapeToolAdapter(legacyRectangle);
        adapter.build(12,-8);
    }
}