package ch.hslu.demo.sw05;

public abstract class Shape {
    private int x;
    private int y;

    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int additionalX, int additionalY) {
        x += additionalX;
        y += additionalY;
    }

    public abstract int getPerimeter();

    public abstract int getArea();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
