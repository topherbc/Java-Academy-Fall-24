package com.pluralsight;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        System.out.println("Hello Class!"); //prints with new line
//        System.out.print("What's different?");

        int exampleNumber = 10;
//        System.out.printf("A number I wrote earlier is: %d \n", exampleNumber);


//        System.out.printf("Pi value is %.5f and I like eating pie \n", Math.PI);

        int id = 10135;
        String exampleName = "Brandon Plyers";
        float pay = 5239.77f;

//        System.out.printf("(id: %d) $%.2f from person %s \n", id, pay, exampleName);


        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = keyboard.nextLine();

        System.out.println("How's it hanging " + name);

        System.out.print("Enter a number: ");
        double number = keyboard.nextDouble();

        System.out.println("The number is: " + number);



    }
}
