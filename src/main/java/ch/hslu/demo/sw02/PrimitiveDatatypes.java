package ch.hslu.demo.sw02;

public class PrimitiveDatatypes {
    private int integer;
    private float floatNr;

    public PrimitiveDatatypes() {
        this.integer = 2147483647;
        this.floatNr = 3.4028235e38f;
    }

    public int addInteger(final int value) {
        integer = integer + value;
        return integer;
    }

    public float addFloat(final float value) {
        floatNr = floatNr + value;
        return floatNr;
    }

    public float divideFloat() {
        return 2 + 5f / 2 ;
    }

    public int divideInteger() {
        return 2 + 5 / 2;
    }

    public int getInteger() {
        return integer;
    }
}
