class Main{
    public static void main(String[] args){

        //initialize our figues
        RoundedRectangle roundedRect = new RoundedRectangle(4,8,25);
        Polygon polygon = new Polygon(10, 12);
        Rectangle rect = new Rectangle(12,6);

        //adapt if needed
        RectangleAdapter roundedAdapter = new RectangleAdapter(roundedRect);
        RectangleAdapter polygonAdapter = new RectangleAdapter(polygon);

        //draw figures
        DrawRectangle drawRect = new DrawRectangle(roundedAdapter);
        drawRect.draw();
        System.out.println("\n");
        drawRect.setRectangle(polygonAdapter);
        drawRect.draw();
        System.out.println("\n");
        drawRect.setRectangle(rect);
        drawRect.draw();

    }
}