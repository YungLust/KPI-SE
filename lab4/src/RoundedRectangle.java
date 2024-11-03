public class RoundedRectangle {
    private float width;
    private float height;
    private float cornerRadius;

    public RoundedRectangle(float width, float height, float cornerRadius) {
        this.width = width;
        this.height = height;
        this.cornerRadius = cornerRadius;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(float cornerRadius) {
        this.cornerRadius = cornerRadius;
    }
}
