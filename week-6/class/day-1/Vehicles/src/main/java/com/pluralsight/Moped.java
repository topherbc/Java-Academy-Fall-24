package com.pluralsight;

public class Moped extends Vehicle {


    public void testMethod() {
        System.out.println(this.getWheelCount()); //works with private field
        //System.out.println(this.wheelCount); //doesn't work
    }

}
