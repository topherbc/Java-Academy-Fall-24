package com.pluralsight;

public class Car extends Vehicle{
    private int seatbelts;

    private boolean tintedWindows;

    public int getSeatbelts() {
        return seatbelts;
    }

    public void setSeatbelts(int seatbelts) {
        this.seatbelts = seatbelts;
    }
}
