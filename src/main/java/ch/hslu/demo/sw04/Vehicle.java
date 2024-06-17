package ch.hslu.demo.sw04;

import java.beans.PropertyChangeEvent;

/**
 * The Vehicle class represents a vehicle with a motor and a lamp.
 *
 * @author Sacha Vogel
 */
public class Vehicle implements MotorStateListener {
    private final Motor motor;
    private final Switchable lamp;

    public Vehicle() {
        this(new Motor());
    }

    public Vehicle(Motor motor) {
        this.motor = motor;
        this.lamp = new Lamp();
        this.motor.addPropertyChangeListener(this::handleMotorEvent);
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

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getSource().equals("motor")) {
            handleMotorEvent(evt);
        }
    }

    private void handleMotorEvent(PropertyChangeEvent evt) {
        if (MotorStateEnum.ON.equals(MotorStateEnum.valueOf(evt.getNewValue().toString()))) {
            System.out.println("motor is on");
        } else {
            System.out.println("motor is off");
        }
    }

    public Motor getMotor() {
        return this.motor;
    }
}
