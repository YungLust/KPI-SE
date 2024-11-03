public class RoundedRectangle {
    private int width;
    private int height;
    private int cornerRadius;

    public RoundedRectangle(int width, int height, int cornerRadius) {
        this.width = width;
        this.height = height;
        this.cornerRadius = cornerRadius;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void setCornerRadius(int cornerRadius) {
        this.cornerRadius = cornerRadius;
    }
}
