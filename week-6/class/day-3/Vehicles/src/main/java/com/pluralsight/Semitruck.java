package com.pluralsight;

public class Semitruck extends Vehicle{
    private boolean trailerCapable;

    public Semitruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int wheelCount, boolean trailerCapable) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, wheelCount);
        this.trailerCapable = trailerCapable;
    }

    public boolean isHasTrailer() {
        return trailerCapable;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.trailerCapable = hasTrailer;
    }
}
