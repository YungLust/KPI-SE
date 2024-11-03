public class DrawRectangle {
    private Rectangle rectangle;

    public void draw(float width, float height) {
        width = rectangle.getWidth();
        height = rectangle.getHeight();
        System.out.println("Drawing rectangle:");

        for (int i = 0; i < height; i++) {
            boolean heightSide = i == 0 || i == height - 1;
            for (int j = 0; j < width; j++) {
                boolean widthSide = j == 0 || j == width - 1;
                if (widthSide && heightSide) {
                    System.out.print("+");
                }
                else if (widthSide){
                    System.out.print("|");
                }
                else if(heightSide){
                    System.out.print("-—-");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}
