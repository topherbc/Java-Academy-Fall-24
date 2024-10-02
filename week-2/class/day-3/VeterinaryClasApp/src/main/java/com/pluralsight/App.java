package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Entry for our vet portal
        //First time clients, information about animal

        Scanner in = new Scanner(System.in);

        Animal patient1 = new Animal();

        Animal patient2 = new Animal();


        System.out.println("Welcome to our Veterinary clinic! \n");

        System.out.print("Please enter your animals type: ");
        String type = in.nextLine();
        patient1.setAnimalType(type);

        System.out.print("Please enter your animals name: ");
        String name = in.nextLine();
        patient1.setName(name);

        System.out.print("Please enter your animals weight: ");
        double weight = in.nextDouble();
        patient1.setWeight(weight);

        System.out.print("Please enter your animals age: ");
        int age = in.nextInt();
        patient1.setAge(age);

        System.out.println("\n--------\n");

        System.out.println("Thanks for all your patient info! \n");
        System.out.println("--Please confirm the following information is correct--");

        patient1.printAnimalInformation();




    }
}
