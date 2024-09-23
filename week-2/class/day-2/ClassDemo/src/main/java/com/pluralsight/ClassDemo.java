package com.pluralsight;

public class ClassDemo {

    public static void main(String[] args) {
        //Person instantiation
        Person chris = new Person(15.5, "Chris", 10000);

        Person aleks = new Person(15.5, "Aleks", 10000);

        chris.work(7);

        display(chris);

        chris.sleep(5);

        display(chris);


       /*
            chris = {
                name: "Chris",
                age: 10000
             }

             chris.name; //Chris


        */
    }

    public static void display(Person human) {

        System.out.println("The " + human.getName() + "'s energy level is " + human.getEnergy());

    }

}
