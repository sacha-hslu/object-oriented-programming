package ch.hslu.demo.sw11;

import ch.hslu.demo.sw04.Motor;
import ch.hslu.demo.sw04.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VehicleMotorStateIntegrationTest {

    private Motor motor;

    @BeforeEach
    void setUp() {
        motor = new Motor();
    }

    @Test
    void testEventListener() {
        Vehicle vehicle = new Vehicle(motor);
        motor.registerListener(vehicle);
        vehicle.startVehicle();
        motor.reportProblem();
        vehicle.stopVehicle();
    }
}
