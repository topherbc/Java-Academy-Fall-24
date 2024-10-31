package com.pluralsight;

public class Game {
    public static void main(String[] args) {
        Card playingCard1 = new PlayingCard("playing card", "A", "spade", "blue");

        System.out.println(playingCard1.getValue());
    }
}
