package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        Card playingCard1 = new PlayingCard("playing card", "A", "spade", "blue");

        playUno();
    }

    public static void playUno() {7", "green");
        UNO unoCard2 = new UNO("1", "blue");
        UNO unoCard3 = new UNO("2", "green");
        UNO unoCard4 = new UNO("3", "red");
        UNO unoCard5 = new UNO("4", "yellow");
        UNO unoCard6 = new UNO("5", "green");
        UNO unoCard7 = new UNO("6", "red");

        UNO unoCard1 = new UNO("
        System.out.println(unoCard1.getValue());

        ArrayList<UNO> unoCards = new ArrayList<>();
        unoCards.add(unoCard1);
        unoCards.add(unoCard2);
        unoCards.add(unoCard3);
        unoCards.add(unoCard4);
        unoCards.add(unoCard5);
        unoCards.add(unoCard6);
        unoCards.add(unoCard7);


        PlayersHand<UNO> unoCardHand = new PlayersHand(unoCards);
        List<UNO> list = unoCardHand.getCards();
    }

    public static void blackjack() {
        PlayingCard card1 = new PlayingCard("2", "spade", "spade", "black");
        PlayingCard card2 = new PlayingCard("4", "hearts", "hearts", "red");

        ArrayList<PlayingCard> hand = new ArrayList<>();
        hand.add(card1);
        hand.add(card2);


        PlayersHandUnknownType blackjackHand = new PlayersHandUnknownType(hand);

        List<? extends Card> cards = blackjackHand.getCards();
    }
}
