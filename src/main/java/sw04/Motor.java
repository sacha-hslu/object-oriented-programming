package sw04;

import sw04.Switchable;

public class Motor implements Switchable {

    private boolean isSwitchedOn;
    private int rpm;

    public Motor() {
        this.isSwitchedOn = false;
        this.rpm = 0;
    }

    @Override
    public void switchOn() {
        if (isSwitchedOff()) {
            isSwitchedOn = true;
            rpm = 6000;
        }
    }

    @Override
    public void switchOff() {
        isSwitchedOn = false;
        rpm = 0;
    }

    @Override
    public boolean isSwitchedOn() {
        return isSwitchedOn;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isSwitchedOn;
    }

    public int getRpm() {
        return rpm;
    }
}
