package com.pluralsight;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import java.time.*;

public class TheaterReservations {

    public static void main(String[] args) {
        /*
        Prompt the user for their full name, the date of the show, and the number of tickets they will need.
        Once the reservation is made, display a confirmation message to the customer in this format:
        # ticket(s) reserved for (date) under (LastName, FirstName)
        If only one ticket is reserved, the confirmation should not include an "s"
        A sample trace of your program output is shown below.  Bolded code is what the user entered.

        Please enter your name: Geri Johnson↵
        What date will you be coming (MM/dd/yyyy): 5/13/2023↵
        How many tickets would you like? 3↵
        3 tickets reserved for 2023-05-13 under Johnson, Geri

        A different trace would be:

        Please enter your name: Geri Johnson↵
        What date will you be coming (MM/dd/yyyy): 5/13/2023↵
        How many tickets would you like? 1↵
        1 ticket reserved for 2023-05-13 under Johnson, Geri

         */

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = myScanner.nextLine();

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String enteredDate = myScanner.nextLine();

        System.out.print("How many tickets would you like?: ");
        int ticketCount = myScanner.nextInt();

        String pluralLetter = "";

        if (ticketCount > 1) {
            pluralLetter = "s";
        }

        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate sanitizedDate = LocalDate.parse(enteredDate, format);

        String[] names = fullName.split(" ");

        System.out.println(ticketCount + " ticket" + pluralLetter + " reserved for " + sanitizedDate + " under " + names[1] + ", " + names[0]);


    }

}
