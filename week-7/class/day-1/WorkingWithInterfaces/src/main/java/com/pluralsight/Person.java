package com.pluralsight;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        //startString > compareString = 1
        //startString == compareString = 0
        //startString < compareString = -1

        if(this.lastName.compareTo(other.lastName) != 0) {
            return this.lastName.compareTo(other.lastName);
        } else if(this.firstName.compareTo(other.firstName) != 0 ) {
            return this.firstName.compareTo(other.firstName);
        }

        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
