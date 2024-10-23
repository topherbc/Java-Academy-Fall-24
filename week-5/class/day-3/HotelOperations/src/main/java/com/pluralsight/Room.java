package com.pluralsight;

public class Room {
    private boolean occupied, dirty;
    private double price;
    private int numberOfBeds;

    public Room(boolean occupied, boolean dirty, double price, int numberOfBeds) {
        this.occupied = occupied;
        this.dirty = dirty;
        this.price = price;
        this.numberOfBeds = numberOfBeds;
    }

    public void cleanroom() {
        this.dirty = false;
    }

    public void checkout() {
        this.occupied = false;
    }

    public void checkIn() {
        if(this.isAvailable()) {
            this.occupied = true;
            this.dirty = true;
        } else {
            System.out.println("Sorry, room is not available!");
        }
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isAvailable() {
        return (!this.occupied && !this.dirty);
    }

    public boolean isOccupied() {
        return this.occupied;
    }

    public boolean isDirty() {
        return this.dirty;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }
}
