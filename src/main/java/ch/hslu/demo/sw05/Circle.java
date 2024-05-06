package ch.hslu.demo.sw05;

public class Circle extends Shape {
    private int diameter;

    public Circle(int x, int y, int diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public int getPerimeter() {
        return 0;
    }

    @Override
    public int getArea() {
        return 0;
    }
}
