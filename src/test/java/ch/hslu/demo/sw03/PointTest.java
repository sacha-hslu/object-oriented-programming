package ch.hslu.demo.sw03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void calculateQuadrant_firstQuadrant() {
        Point point = new Point(1, 1);

        var quadrant = point.calculateQuadrant();

        assertEquals(1, quadrant);
    }

    @Test
    void calculateQuadrant_secondQuadrant() {
        Point point = new Point(-1, 1);

        var quadrant = point.calculateQuadrant();

        assertEquals(2, quadrant);
    }

    @Test
    void calculateQuadrant_thirdQuadrant() {
        Point point = new Point(-1, -1);

        var quadrant = point.calculateQuadrant();

        assertEquals(3, quadrant);
    }

    @Test
    void calculateQuadrant_fourthQuadrant() {
        Point point = new Point(1, -1);

        var quadrant = point.calculateQuadrant();

        assertEquals(4, quadrant);
    }

    @Test
    void calculateQuadrant_onLine() {
        Point point = new Point(0, 0);

        var quadrant = point.calculateQuadrant();

        assertEquals(0, quadrant);
    }
}
