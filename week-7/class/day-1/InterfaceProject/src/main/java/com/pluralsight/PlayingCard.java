package com.pluralsight;

public class PlayingCard extends Card implements PlayableInterface {

    private String suit, color;

    public PlayingCard(String description, String type, String suit, String color) {
        super(description, type);
        this.suit = suit;
        this.color = color;
    }

    @Override
    public double getValue() {
        switch(this.type) {
            case "A": return 1;
            case "K", "Q", "J": return 10;
            default: return Double.parseDouble(this.type);
        }
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void play() {
        System.out.println("Played a card!");
    }
}
