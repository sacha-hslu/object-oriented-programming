 
package ch.hslu.demo.sw04;


import ch.hslu.demo.sw03.Point;

public class Line {

    private Point pStart;
    private Point pEnd;

    public Line(int xStart, int yStart, int xEnd, int yEnd) {
        this(new Point(xStart, yStart), new Point(xEnd, yEnd));
    }

    public Line(final Point pStart, final Point pEnd) {
        this.pStart = pStart;
        this.pEnd = pEnd;
    }

    public void setpStart(int x, int y) {
        setpStart(new Point(x, y));
    }

    public void setpStart(Point pStart) {
        this.pStart = pStart;
    }

    public Point getpStart() {
        return pStart;
    }

    public void setpEnd(int x, int y) {
        setpEnd(new Point(x, y));
    }

    public void setpEnd(Point pEnd) {
        this.pEnd = pEnd;
    }

    public Point getpEnd() {
        return pEnd;
    }

}
