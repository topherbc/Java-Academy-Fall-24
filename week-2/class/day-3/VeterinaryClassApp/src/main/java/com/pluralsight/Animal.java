package com.pluralsight;

public class Animal {

    private String animalType, color, name, gender, taxonomy, blood;
    private int numberOfTeeth, numberOfLegs, age;
    private double weight;

    public Animal() {
        this.animalType = "";
        this.color = "";
        this.name = "";
        this.age = 0;
        this.gender = "";
        this.taxonomy = "";
        this.blood = "";
        this.numberOfLegs = 4;
        this.numberOfTeeth = 4;
        this.weight = 0.0;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printAnimalInformation() {
        System.out.printf("Animals name: %s \n", this.name);
        System.out.printf("Animals type: %s \n", this.animalType);
        System.out.printf("Animals weight: %.2f \n", this.weight);
        System.out.printf("Animals age: %d \n", this.age);
    }
}
