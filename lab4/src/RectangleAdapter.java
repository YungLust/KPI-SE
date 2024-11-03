
public class RectangleAdapter extends Rectangle{
    private int width;
    private int height;

    public RectangleAdapter(RoundedRectangle roundedRectangle){

        //rounded rectangle is a rectangle when it has 0 corner radius
        roundedRectangle.setCornerRadius(0);

        width = roundedRectangle.getWidth();
        height = roundedRectangle.getHeight();
    }

    public RectangleAdapter(Polygon polygon){

        //polygon is a square when it has 4 sides
        polygon.setSides(4);

        /*
         * radius is distance from center of polygon to its points
         * in our occasion it`s a half of the square`s diagonal
         * so to get square`s side we need to multiply radius by sqrt(2)
         */
        int sqrSide = (int) (polygon.getRadius() * Math.sqrt(2));
        width = sqrSide;
        height = sqrSide;

    }

    @Override
    public int getWidth(){
        return width;
    }

    @Override
    public int getHeight(){
        return height;
    }
}

