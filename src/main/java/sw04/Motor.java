package sw04;

import sw04.Switchable;
import sw05.CountingSwitchable;

public class Motor extends CountingSwitchable {

    private boolean isSwitchedOn;
    private int rpm;

    public Motor() {
        this.isSwitchedOn = false;
        this.rpm = 0;
    }

    @Override
    public void switchOn() {
        super.switchOn();
        if (isSwitchedOff()) {
            isSwitchedOn = true;
            rpm = 6000;
        }
    }

    @Override
    public void switchOff() {
        super.switchOff();
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

    public int getCounter() {
        return super.getCounter();
    }

    public int getRpm() {
        return rpm;
    }
}
