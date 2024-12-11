package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
            Prompt the user for the size of the sandwich (1 or 2):
            -1: Regular: base price $5.45
            -2: Large: base price $8.95
            Prompt the user for their age:
            -Student (17 years old or younger)
            —receive a 10% discount
            -Seniors (65 years old or older)
            —receive a 20% discount
            Display the cost of the sandwich to the screen
         */

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Prompt the user for the size of the sandwich (1 or 2):\n" +
                "            -1: Regular: base price $5.45\n" +
                "            -2: Large: base price $8.95\n");
        System.out.print("Select an option: ");
        int sandwichSize = keyboard.nextInt();

        float price = 0.00f;

        //DRY - don't repeat yourself

        if(sandwichSize == 1) {
            price = 5.45f;
        } else if (sandwichSize == 2){
            price = 8.95f;
        } else {
            System.out.println("ERROR WRONG OPTION SELECTED COMEON");
        }


        System.out.print("Please enter your age for a possible discount: ");
        int age = keyboard.nextInt();

        if(age <= 17) {
            /*
                -Student (17 years old or younger)
                —receive a 10% discount
             */
            price *= 0.9;
        } else if(age >= 65) {
            /*
                Seniors (65 years old or older)
                —receive a 20% discount
             */
            price *= 0.8;
        }

        System.out.printf("The cost of your sandwich is: $%.2f", price);



    }
}
