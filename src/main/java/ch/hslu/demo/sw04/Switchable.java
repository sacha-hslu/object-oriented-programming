
package ch.hslu.demo.sw04;

/**
 * Interface for a switchable device.
 */
public interface Switchable {

    /**
     * Turns the device on.
     */
    void switchOn();

    /**
     * Turns the device off.
     */
    void switchOff();

    /**
     * Checks if the device is switched on.
     *
     * @return true when device is on.
     */
    boolean isSwitchedOn();

    /**
     * Checks if the device is switched on.
     *
     * @return true when device is off.
     */
    boolean isSwitchedOff();
}
