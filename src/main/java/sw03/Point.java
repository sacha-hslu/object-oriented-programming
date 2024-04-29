 
package sw03;

/**
 * The Point class represents a point in the coordinate system.
 * It remembers it place on x- and y-axis and is able to calculate the quadrant.
 *
 * @author Sacha Vogel
 * @version 0.0.1
 */
public final class Point {
    private final int x;
    private final int y;

    /**
     * Creates a point within a coordinate system.
     *
     * @param x
     *        Value on the x-axis
     * @param y
     *        Value on the y-axis
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Copies to new point - copy constructor
     *
     * @param point
     *        point to copy
     */
    public Point(Point point) {
        this(point.getX(), point.getY());
    }

    /**
     * Calculate the current quadrant on the coordinate system.
     * If the point is touching any axis it returns zero.
     *
     * @return quadrant as an integer
     */
    public int calculateQuadrant() {
        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        }
        return 0;
    }

    /**
     * Gets the member variable x-axis.
     *
     * @return X coordinate of point
     */
    public int getX() {
        return x;
    }

    /**
     * Gets the member variable y-axis.
     *
     * @return Y coordinate of point
     */
    public int getY() {
        return y;
    }
}
