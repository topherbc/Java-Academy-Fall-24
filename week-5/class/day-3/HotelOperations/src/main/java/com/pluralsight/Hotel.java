package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites, numberOfRooms, bookedSuites, bookedRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedRooms = bookedRooms;
    }


    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if(this.getAvailableRooms() >= numberOfRooms && !isSuite) {
            this.bookedRooms += numberOfRooms;
            return true;
        } else if(this.getAvailableSuites() >= numberOfRooms && isSuite) {
            this.bookedSuites += numberOfRooms;
            return true;
        }
        return false;
    }

    public int getAvailableRooms() {
        return this.numberOfRooms-this.bookedRooms;
    }

    public int getAvailableSuites() {
        return this.numberOfSuites-this.bookedSuites;
    }
}
