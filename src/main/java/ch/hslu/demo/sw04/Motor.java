package ch.hslu.demo.sw04;


import ch.hslu.demo.sw05.CountingSwitchable;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Motor extends CountingSwitchable {

    private final List<PropertyChangeListener> listeners;
    private boolean isSwitchedOn;
    private int rpm;

    public Motor() {
        this.isSwitchedOn = false;
        this.rpm = 0;
        this.listeners = new ArrayList<>();
    }

    @Override
    public void switchOn() {
        super.switchOn();
        if (isSwitchedOff()) {
            isSwitchedOn = true;
            rpm = 6000;
        }
        firePropertyChangeEvent(MotorStateEnum.ON);
    }

    @Override
    public void switchOff() {
        super.switchOff();
        isSwitchedOn = false;
        rpm = 0;
        firePropertyChangeEvent(MotorStateEnum.OFF);
    }

    public void reportProblem() {
        switchOff();
        firePropertyChangeEvent(MotorStateEnum.PROBLEM);
    }

    @Override
    public boolean isSwitchedOn() {
        return isSwitchedOn;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isSwitchedOn;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        listeners.add(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        listeners.remove(listener);
    }

    private void firePropertyChangeEvent(MotorStateEnum motorState) {
        PropertyChangeEvent changeEvent = new PropertyChangeEvent("motor", "motorState", null, motorState);
        for (PropertyChangeListener listener : listeners) {
            listener.propertyChange(changeEvent);
        }
    }

    public int getCounter() {
        return super.getCounter();
    }

    public int getRpm() {
        return rpm;
    }

    public List<PropertyChangeListener> getListeners() {
        return listeners;
    }
}
