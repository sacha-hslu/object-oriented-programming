 
package sw04;

/**
 * The Vehicle class represents a vehicle with a motor and a lamp.
 *
 * @author Sacha Vogel
 */
public class Vehicle {
    private final Motor motor;
    private final Switchable lamp;

    public Vehicle() {
        this.motor = new Motor();
        this.lamp = new Lamp();
    }

    /**
     * Starts the vehicle and its devices up.
     *
     * @return Current rpm of the motor
     */
    public int startVehicle() {
        motor.switchOn();
        lamp.switchOn();
        return motor.getRpm();
    }

    /**
     * Stops the vehicle and its devices.
     */
    public void stopVehicle() {
        motor.switchOff();
        lamp.switchOff();
    }

}
