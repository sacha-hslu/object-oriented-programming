package ch.hslu.demo.sw06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovingPointTest {

    @Test
    void moveRelative_byPoint_pointMoved() {
        MovingPoint testee = new MovingPoint(1, 1);

        testee.moveRelative(new MovingPoint(2, 3));

        assertEquals(3, testee.getX());
        assertEquals(4, testee.getY());
    }

}