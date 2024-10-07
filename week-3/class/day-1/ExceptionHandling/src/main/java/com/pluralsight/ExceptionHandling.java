package com.pluralsight;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            String[] studentNames = {"Nathan", "Sam", "Tumelo", "Tommy", "London", "Tife"};

            //Array
            System.out.print("Pick a student (select #0 - #6): ");

            int index = scanner.nextInt();

            System.out.println(studentNames[index]); //print name
        }
        catch (Exception e) {
            System.out.println("Hey, please pick a better number, we don't have a student in that placeholder");
        }
    }
}
