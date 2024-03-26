package sw04;

import org.junit.jupiter.api.Test;
import sw03.Point;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void newLineWithPoints() {
        Point start = new Point(2, 3);
        Point end = new Point(6, 9);
        Line line = new Line(start, end);

        assertEquals(start, line.getpStart());
        assertEquals(end, line.getpEnd());
    }

    @Test
    void newLineWithCoordinates() {
        Line line = new Line(2, 3, 6, 9);

        assertEquals(3, line.getpStart().getY());
        assertEquals(6, line.getpEnd().getX());
    }

    @Test
    void setpStartAndpEnd() {
        Point start = new Point(2, 3);
        Point end = new Point(6, 9);
        Line line = new Line(start, end);

        line.setpStart(3, 2);
        line.setpEnd(9, 6);

        assertEquals(2, line.getpStart().getY());
        assertEquals(9, line.getpEnd().getX());
    }

}