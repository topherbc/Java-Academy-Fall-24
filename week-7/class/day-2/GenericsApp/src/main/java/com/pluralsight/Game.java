package com.pluralsight;

import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {
        Card playingCard1 = new PlayingCard("playing card", "A", "spade", "blue");

        playUno();
    }

    public static void playUno() {
        UNO unoCard1 = new UNO("7", "green");
        UNO unoCard2 = new UNO("1", "blue");
        UNO unoCard3 = new UNO("2", "green");
        UNO unoCard4 = new UNO("3", "red");
        UNO unoCard5 = new UNO("4", "yellow");
        UNO unoCard6 = new UNO("5", "green");
        UNO unoCard7 = new UNO("6", "red");

        System.out.println(unoCard1.getValue());

        ArrayList<UNO> unoCards = new ArrayList<>();
        unoCards.add(unoCard1);
        unoCards.add(unoCard2);
        unoCards.add(unoCard3);
        unoCards.add(unoCard4);
        unoCards.add(unoCard5);
        unoCards.add(unoCard6);
        unoCards.add(unoCard7);

        PlayersHand<UNO> unoCardHand = new PlayersHand<>(unoCards);
    }

    public static void blackjack() {
        PlayingCard card1 = new PlayingCard("2", "spade", "spade", "black");
        PlayingCard card2 = new PlayingCard("4", "hearts", "hearts", "red");

        ArrayList<PlayingCard> blackjackHand = new ArrayList<>();
        blackjackHand.add(card1);
        blackjackHand.add(card2);

        PlayersHand<PlayingCard> blackjackPlayersHand1 = new PlayersHand<>(blackjackHand);

    }
}
