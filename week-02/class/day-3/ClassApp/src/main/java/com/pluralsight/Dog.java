package com.pluralsight;

public class Dog {

    private String dogBreed;
    private String name;
    private int age;
    private String color;

    public Dog(String dogBreed, String name, int age, String color) {
        this.dogBreed = dogBreed;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }



}
