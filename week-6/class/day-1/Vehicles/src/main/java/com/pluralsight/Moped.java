package com.pluralsight;

public class Moped extends Vehicle {


    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int wheelCount) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, wheelCount);
    }

    public void testMethod() {
        System.out.println(this.getWheelCount()); //works with private field

    }

}
