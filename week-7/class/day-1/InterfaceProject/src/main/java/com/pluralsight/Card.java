package com.pluralsight;

/*
        Possible Cards

        UNO Cards

        Yu gi oh

        Pokemon

        Magic the Gathering

        Hearthstone

        Playing Cards
        spades
        war
        hearts
        go fish
        slapjack
        spoons
        Texas Hold'em, 5 card draw, blackjack


        Collectable Cards
        Football cards
        Baseball cards
        Basketball cards

        Tarot cards

 */

public abstract class Card {

    protected String description, type;

    public Card(String description, String type) {
        this.description = description;
        this.type = type;
    }

    public abstract double getValue();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
