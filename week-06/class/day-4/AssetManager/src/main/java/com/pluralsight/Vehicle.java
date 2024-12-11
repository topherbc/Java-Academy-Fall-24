package com.pluralsight;

public class Vehicle extends Asset {
    private String makeModel;
    private int odometer, year;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int odometer, int year) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.odometer = odometer;
        this.year = year;
    }

    @Override
    public double getValue() {
        double value = 0;

        if(this.year <= 3) {
            value = (this.getOriginalCost() - (this.year * (0.03 * this.getOriginalCost())));
        } else if(this.year >= 4 && this.year <= 6) {
            value = (this.getOriginalCost() - (this.year * (0.06 * this.getOriginalCost())));
        } else if(this.year >= 7 && this.year <= 10) {
            value = (this.getOriginalCost() - (this.year * (0.08 * this.getOriginalCost())));
        } else {
            value = this.getOriginalCost()-1000;
        }

        if(this.odometer >= 100000 && !this.makeModel.contains("Honda") && !this.makeModel.contains("Toyota")) {
            value *= 0.75;
        }

        return value;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
