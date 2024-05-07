package ch.hslu.demo.sw04;


import ch.hslu.demo.sw05.CountingSwitchable;

import java.util.ArrayList;
import java.util.List;

public class Motor extends CountingSwitchable {

    private final List<MotorStateListener> listeners;
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
        notifyMotorState(MotorStateEnum.ON);
    }

    @Override
    public void switchOff() {
        super.switchOff();
        isSwitchedOn = false;
        rpm = 0;
        notifyMotorState(MotorStateEnum.OFF);
    }

    public void reportProblem() {
        notifyMotorState(MotorStateEnum.PROBLEM);
    }

    @Override
    public boolean isSwitchedOn() {
        return isSwitchedOn;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isSwitchedOn;
    }

    public void registerListener(MotorStateListener listener) {
        listeners.add(listener);
    }

    public void deregisterListener(MotorStateListener listener) {
        listeners.remove(listener);
    }

    private void notifyMotorState(MotorStateEnum motorState) {
        for (MotorStateListener listener : listeners) {
            listener.notifyMotorState(motorState);
        }
    }

    public int getCounter() {
        return super.getCounter();
    }

    public int getRpm() {
        return rpm;
    }

    public List<MotorStateListener> getListeners() {
        return listeners;
    }
}
