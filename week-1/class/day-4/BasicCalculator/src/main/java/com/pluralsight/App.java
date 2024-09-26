package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
//        /*
//            Enter the first number: 5
//            Enter the second number: 12
//            Possible calculations:
//            (A)dd
//            (S)ubtract
//            (M)ultiply
//            (D)ivide
//
//            Please select an option: M
//
//            5 * 12 = 60
//         */
//
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("Enter the first number: ");
//        float firstNum = in.nextFloat();
//
//        System.out.print("Enter the second number: ");
//        float secondNum = in.nextFloat();
//        in.nextLine(); //consume the CRLF before next question
//
//        System.out.println("Possible calculations: \n(A)dd\n(S)ubtract\n(M)ultiply\n(D)ivide\n");
//
//        System.out.print("Please select an option: ");
//        String option = in.nextLine();
//
//        float solution = firstNum * secondNum;
//
//        System.out.printf("%.2f * %.2f = %.2f", firstNum, secondNum, solution);

        //METHOD = FUNCTION


        //OVEN - 400f //parameter
        //A pan with cake badder //input
        //A pan with a cake //output

        oven(400, "Cake");

        int addedNums = add(1, 2);
//        System.out.println(addedNums);

        /* Exercise

        1. Write add method, accepts two parameters, returns int of two parameters added together

        2. Write a printToScreen method, you call and prints "Hello World"
        3. Invoke this print method, 3 times


        4. Write multiply method, accepts two parameters, returns int of two parameters multiplied together


        */
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static void oven(int degrees, String item) {
        System.out.println("Oven is heated to: " + degrees);
        System.out.println("Cooking " + item);
    }
}
