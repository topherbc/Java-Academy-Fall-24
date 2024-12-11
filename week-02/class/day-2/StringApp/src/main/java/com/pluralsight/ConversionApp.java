package com.pluralsight;

import java.util.regex.Pattern;

public class ConversionApp {
    public static void main(String[] args) {
        // string contains "id|description|quantity|price"
        String input = "111|Hot Chocolate (12-count)|21|4.99";
        String[] tokens = input.split(Pattern.quote("|"));

        int id = Integer.parseInt(tokens[0]);
        String description = tokens[1];
        int quantity = Integer.parseInt(tokens[2]);
        double price = Double.parseDouble(tokens[3]);


        System.out.println(price + 1);


    }
}
