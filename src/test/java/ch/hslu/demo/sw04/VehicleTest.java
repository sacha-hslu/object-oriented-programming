package ch.hslu.demo.sw04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void startVehicle_engineStartedLightsOn() {
        Vehicle vehicle = new Vehicle();

        var rpm = vehicle.startVehicle();

        assertEquals(6000, rpm);
    }

}