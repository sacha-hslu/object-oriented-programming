package ch.hslu.demo.sw04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorTest {

    private Motor motor;

    @BeforeEach
    void setUp() {
        motor = new Motor();
    }

    @Test
    void createMotor_motorIsOff() {
        assertEquals(0, motor.getRpm());
        assertFalse(motor.isSwitchedOn());
        assertTrue(motor.isSwitchedOff());
    }

    @Test
    void switchOn_motorRunning() {

        motor.switchOn();

        assertEquals(6000, motor.getRpm());
        assertTrue(motor.isSwitchedOn());
        assertFalse(motor.isSwitchedOff());
    }

    @Test
    void switchOff_runningMotor_motorShutsOff() {

        motor.switchOn();
        assertTrue(motor.isSwitchedOn());

        motor.switchOff();
        assertEquals(0, motor.getRpm());
        assertFalse(motor.isSwitchedOn());
        assertTrue(motor.isSwitchedOff());
    }
}