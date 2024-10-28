package com.pluralsight;

public class Hovercraft extends Vehicle{
    private boolean hasFan, tubing;

    private int propellerSpeed;

    public boolean isHasFan() {
        return hasFan;
    }

    public void setHasFan(boolean hasFan) {
        this.hasFan = hasFan;
    }

    public boolean isTubing() {
        return tubing;
    }

    public void setTubing(boolean tubing) {
        this.tubing = tubing;
    }

    public int getPropellerSpeed() {
        return propellerSpeed;
    }

    public void setPropellerSpeed(int propellerSpeed) {
        this.propellerSpeed = propellerSpeed;
    }
}
