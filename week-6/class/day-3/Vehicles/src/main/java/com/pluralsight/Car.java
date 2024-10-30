package com.pluralsight;

public class Car extends Vehicle{
    private int seatbelts;

    private boolean tintedWindows;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int wheelCount, int seatbelts, boolean tintedWindows) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, wheelCount);
        this.seatbelts = seatbelts;
        this.tintedWindows = tintedWindows;
    }

    @Override
    public void accelerate() {
        System.out.println("car accelerates, uses fuel, presses gas pedal");
    }

    public int getSeatbelts() {
        return seatbelts;
    }

    public void setSeatbelts(int seatbelts) {
        this.seatbelts = seatbelts;
    }
}
