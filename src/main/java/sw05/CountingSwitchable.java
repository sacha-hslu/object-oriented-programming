package sw05;

import sw04.Switchable;

public abstract class CountingSwitchable implements Switchable {

    private int counter;

    @Override
    public void switchOn() {
        counter++;
    }

    @Override
    public void switchOff() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
