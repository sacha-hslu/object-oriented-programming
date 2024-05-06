package ch.hslu.demo.sw03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    void max_returnsMaxValue() {
        Demo testee = new Demo();

        var result = testee.max(1, 2);

        assertEquals(2, result);
    }

    @Test
    void max_returnsMaxOfThreeValue() {
        Demo testee = new Demo();

        var result = testee.max(2, 3, 1);

        assertEquals(3, result);
    }

    @Test
    void min_returnsMinValue() {
        Demo testee = new Demo();

        var result = testee.min(1, 2);

        assertEquals(1, result);
    }

    @Test
    void printRows_for() {
        Demo testee = new Demo();

        testee.printRowsFor();
    }

    @Test
    void printRows_while() {
        Demo testee = new Demo();

        testee.printRowsWhile();
    }

    @Test
    void printRows_doWhile() {
        Demo testee = new Demo();

        testee.printRowsDoWhile();
    }

    @Test
    void increaseFloatToOne_oneIsReached() {
        Demo testee = new Demo();

        testee.increaseFloatToOne();
    }

    @Test
    void fixedIncreaseFloatToOne_oneIsReached() {
        Demo testee = new Demo();

        testee.fixedIncreaseFloatToOne();
    }

    @Test
    void printBox_boxPrinted() {
        Demo testee = new Demo();

        testee.printBox(4, 10);
    }
}
