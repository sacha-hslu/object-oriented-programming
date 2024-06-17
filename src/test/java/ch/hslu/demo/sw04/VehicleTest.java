package ch.hslu.demo.sw04;

import org.junit.jupiter.api.Test;

import java.beans.PropertyChangeEvent;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VehicleTest {

    @Test
    void startVehicle_engineStartedLightsOn() {
        Vehicle vehicle = new Vehicle();

        var rpm = vehicle.startVehicle();

        assertEquals(6000, rpm);
    }

    @Test
    void propertyChange_engineStarted_logged() {
        Vehicle vehicle = new Vehicle();
        PropertyChangeEvent event = new PropertyChangeEvent("motor", null, null, MotorStateEnum.ON);

        vehicle.propertyChange(event);

        assertTrue(vehicle.getMotor().isSwitchedOn());
    }

}