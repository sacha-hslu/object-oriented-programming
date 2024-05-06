package ch.hslu.demo.sw06;

import ch.hslu.demo.sw05.Circle;
import ch.hslu.demo.sw05.Rectangle;
import ch.hslu.demo.sw05.Shape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(3, 4, 5, 6);
        Shape shape2 = new Circle(3, 4, 5);

        System.out.println(shape1.getClass().toString() + shape2.getClass().toString());
    }
}
