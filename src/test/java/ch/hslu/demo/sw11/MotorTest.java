package ch.hslu.demo.sw11;

import ch.hslu.demo.sw04.Motor;
import ch.hslu.demo.sw04.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MotorTest {

    private Motor testee;

    @BeforeEach
    void setUp() {
        testee = new Motor();
    }

    @Test
    void registerListener_vehicle_listenerContained() {
        Vehicle listener = new Vehicle();

        testee.registerListener(listener);

        assertEquals(1, testee.getListeners().size());
        assertTrue(testee.getListeners().contains(listener));
    }

    @Test
    void deregisterListener_registerListener_listenerRemoved() {
        Vehicle listener = new Vehicle();
        testee.registerListener(listener);
        assertEquals(1, testee.getListeners().size());
        assertTrue(testee.getListeners().contains(listener));

        testee.deregisterListener(listener);
        
        assertTrue(testee.getListeners().isEmpty());
    }

}