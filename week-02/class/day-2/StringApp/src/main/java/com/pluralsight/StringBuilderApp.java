package com.pluralsight;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder favFoods = new StringBuilder();

        favFoods.append("Spicy Tuna Roll \n");
        favFoods.append("Chicken Strips \n");
        favFoods.append("Seafood Boiled Shrimp \n");
        favFoods.append("Thai Fried Rice \n");
        favFoods.append("Cabeza Tacos \n");
        favFoods.append("Cheeseburger \n");
        favFoods.append("Buffalo Wings \n");
        favFoods.append("Arroz Con Pollo \n");
        favFoods.append("Agua Chiles Verde \n");
        favFoods.append("Steak \n");

        String foods = favFoods.toString();

        System.out.println(foods);


    }
}
