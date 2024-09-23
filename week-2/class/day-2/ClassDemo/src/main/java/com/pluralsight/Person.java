package com.pluralsight;

public class Person {
    private double height;
    private String name;
    private int age;
    private int energy;

    public Person(double height, String name, int age) {
        this.height = height;
        this.name = name;
        this.age = age;
        this.energy = 100;
    }

    public void work(int hours) {
        this.energy -= (hours * 10);
    }

    public void sleep(int hours) {
        this.energy += (hours * 10);
    }

    public int getEnergy() {
        return this.energy;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
