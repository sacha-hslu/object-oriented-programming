package ch.hslu.demo.sw02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimitiveDatatypesTest {

    @Test
    void addInteger_fullInteger_error() {
        PrimitiveDatatypes testee = new PrimitiveDatatypes();

        var result = testee.addInteger(1);

        assertEquals(-2147483648, result);
    }

    @Test
    void addInteger_fullFloat_stillOk() {
        PrimitiveDatatypes testee = new PrimitiveDatatypes();

        var result = testee.addFloat(1.0141E31f);

        assertEquals(3.4028234663852886E38, result);
    }

    @Test
    void addInteger_maxFloat_infinity() {
        PrimitiveDatatypes testee = new PrimitiveDatatypes();

        var result = testee.addFloat(1.0142E31f);

        assertTrue(Float.isInfinite(result));
    }

    @Test
    void divideInteger_roundedFalse() {
        PrimitiveDatatypes testee = new PrimitiveDatatypes();

        var result = testee.divideInteger();

        assertEquals(2, 5/2);
        assertEquals(4, result);
    }

    @Test
    void divideFloat_everythingOk() {
        PrimitiveDatatypes testee = new PrimitiveDatatypes();

        var result = testee.divideFloat();

        assertEquals(2.5f, 5f/2);
        assertEquals(2f, (float)(5/2));
        assertEquals(4.5f, result);
    }
}
