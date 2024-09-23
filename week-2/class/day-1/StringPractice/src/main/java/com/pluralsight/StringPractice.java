package com.pluralsight;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;
import java.time.LocalDate;

public class StringPractice {

    public static void main(String[] args) {
//        String input = "Pittsburgh|Philadelphia|Lancaster";
//        String[] cities = input.split("\\|");

        //.length
        //.trim
        //.toUpperCase
        //.toLowerCase
        //.charAt
        //.indexOf
        //.startsWith
        //.substring
        //.split


//        System.out.println(cities[2]);


        String input = "111.11|Hot Chocolate (12-count)|100";

        String[] tokens = input.split(Pattern.quote("|"));

        String val = "1000";


        int intVal = Integer.parseInt(val);

        double price = Double.parseDouble(tokens[0]);

        int quantity = Integer.parseInt(tokens[2]);

//        System.out.println(quantity);



        String userInput = "17 Oct 2002";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");

        //YYYY-MM-DD

        LocalDate birth = LocalDate.parse(userInput, formatter);

        System.out.println(birth);













    }



}
