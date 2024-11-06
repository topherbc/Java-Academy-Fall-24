package com.pluralsight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Game {
    public static void main(String[] args) {
        Card playingCard1 = new PlayingCard("playing card", "A", "spade", "blue");

        playUno();

        List<String> cardGames = getCardGames();



        //Streams

        List<String> bCardGames = cardGames.stream()
                .filter(cardGame -> cardGame.startsWith("B"))
                .collect(Collectors.toList());

        bCardGames.forEach(System.out::println);
        //The next line has the same output as the one above
//        bCardGames.stream().forEach(card -> System.out.println(card));

        //Transformations without Streams
        //Retrieve list of card games that start with letter B
//        List<String> bCardGames = new ArrayList<>();
//        for (String cardGame : cardGames) {
//            if(cardGame.startsWith("B")) {
//                bCardGames.add(cardGame);
//            }
//        }


        //Print each card game that starts with B
//        for(String bCardGame : bCardGames) {
////            System.out.println(bCardGame);
//        }


    }

    public static void playUno() {
        List<UNO> unoCards = UNO.generateDeck();


        long count = unoCards.stream()
                .filter(card -> card.getColor().contains("blank"))
                .count();

        System.out.println(count);


        PlayersHand<UNO> unoCardHand1 = new PlayersHand(unoCards.subList(0, 7));
        PlayersHand<UNO> unoCardHand2 = new PlayersHand(unoCards.subList(8, 15));




//        System.out.println(unoCardHand1.getCard(1).getDescription() + " " + unoCardHand1.getCard(1).getColor());
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

    public static List<String> getCardGames() {
        List<String> cardGames = new ArrayList<>();
        cardGames.add("Poker");
        cardGames.add("Blackjack");
        cardGames.add("Uno");
        cardGames.add("Bridge");
        cardGames.add("Hearts");
        cardGames.add("Spades");
        cardGames.add("Go Fish");
        cardGames.add("Rummy");
        cardGames.add("Crazy Eights");
        cardGames.add("War");
        cardGames.add("Solitaire");
        cardGames.add("Gin Rummy");
        cardGames.add("Canasta");
        cardGames.add("Pinochle");
        cardGames.add("Snap");
        cardGames.add("Euchre");
        cardGames.add("Old Maid");
        cardGames.add("Baccarat");
        cardGames.add("Cribbage");
        cardGames.add("Spit");
        return cardGames;
    }
}
