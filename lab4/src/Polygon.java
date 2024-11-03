public class Polygon {
    private float radius;
    private int slides;

    public Polygon(float radius, int slides) {
        this.radius = radius;
        this.slides = slides;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public int getSlides() {
        return slides;
    }

    public void setSlides(int slides) {
        this.slides = slides;
    }
}
