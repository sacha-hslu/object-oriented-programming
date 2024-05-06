package ch.hslu.demo.sw05;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public void changeDimension(int relativeWidth, int relativeHeight) {
        width += relativeWidth;
        height += relativeHeight;
    }

    @Override
    public int getPerimeter() {
        // what is that
        return 0;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
