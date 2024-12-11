package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UNO extends Card implements PlayableInterface {
    private String color;

    public UNO(String description, String type, String color) {
        super(description, type);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public void play() {
        System.out.println("Played first card!");
    }

    @Override
    public double getValue() {
        return 0;
    }

    @Override
    public String toString() {
        return this.color + " " + this.description;
    }

    public static List<UNO> generateDeck() {
        List<UNO> deck = new ArrayList<>();
        String[] colors = {"red", "green", "blue", "yellow"};
        String[] numberCards = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] specialCards = {"Skip", "Reverse", "+2"};

        // Add number cards (0-9) for each color
        for (String color : colors) {
            // Single "0" card per color
            deck.add(new UNO("0", "0", color));

            // Two of each number 1-9 per color
            for (int i = 1; i < numberCards.length; i++) {
                deck.add(new UNO(numberCards[i], numberCards[i], color));
                deck.add(new UNO(numberCards[i], numberCards[i], color));
            }
        }

        // Add special cards (Skip, Reverse, +2) for each color
        for (String color : colors) {
            for (String special : specialCards) {
                deck.add(new UNO(special, special, color));
                deck.add(new UNO(special, special, color));
            }
        }

        // Add wild cards (no color)
        for (int i = 0; i < 4; i++) {
            deck.add(new UNO("Wild", "Wild", "blank"));
            deck.add(new UNO("Wild +4", "Wild +4", "blank"));
        }

        Collections.shuffle(deck);

        return deck;
    }
}
