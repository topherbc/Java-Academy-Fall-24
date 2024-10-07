package com.pluralsight;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter a number, 1-100: ");
        //🐻

        int val = scanner.nextInt();
        final int testVal = 1;

        switch(val){
            case testVal:
                System.out.println("Yes, option 1 chosen");
                break;
            case 2:
                System.out.println("Yes, option 2 chosen");
                break;
            case 3:
                System.out.println("Yes, option 3 chosen");
                break;
            case 4, 5, 6, 7, 8, 9, 10:
                System.out.println("Yes, option 4-10 chosen");
                break;
            case 11:
            case 22:
                System.out.println("case 11 and 22");
                break;
            default:
                System.out.println("case not available");
        }

//        if(val == 1) {
//            System.out.println("Yes, option 1 chosen");
//        } else if (val == 2) {
//            System.out.println("Yes, option 2 chosen");
//        } else if (val == 3) {
//                System.out.println("Yes, option 3 chosen");
//        } else {
//            System.out.println();
//        }



    }
}
