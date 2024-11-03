
public class RectangleAdapter extends Rectangle{
    private float width;
    private float height;
    private RoundedRectangle roundedRectangle;
    private Polygon polygon;

    public RectangleAdapter(RoundedRectangle roundedRectangle){
        this.roundedRectangle = roundedRectangle;

        //rounded rectangle is a rectangle when has 0 corner radius
        roundedRectangle.setCornerRadius(0);
    }

    public RectangleAdapter(Polygon polygon){
        this.polygon = polygon;

        //polygon is a square when has 4 slides
        polygon.setSlides(4);
    }
}

