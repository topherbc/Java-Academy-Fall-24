package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public double getReservationTotal() {
        return this.numberOfNights * this.getPrice();
    }

    public double getPrice() {
        //(bool) ? true : false - ternery
        double weekendFactor = (this.weekend) ? 1.1 : 1;

        if(roomType.equalsIgnoreCase("king")) {
            return 139.00  * weekendFactor;
        } else {
            return 124.00 * weekendFactor;
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }
}
