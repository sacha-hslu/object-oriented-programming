package ch.hslu.demo.sw04;


public class Lamp implements Switchable {

    private boolean isSwitchedOn;
    private int brightness;

    public Lamp() {
        this.isSwitchedOn = false;
        this.brightness = 0;
    }


    @Override
    public void switchOn() {
        isSwitchedOn = true;
        brightness = 10;
    }

    @Override
    public void switchOff() {
        isSwitchedOn = false;
        brightness = 0;
    }

    @Override
    public boolean isSwitchedOn() {
        return isSwitchedOn;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isSwitchedOn;
    }

    public int getBrightness() {
        return brightness;
    }
}
