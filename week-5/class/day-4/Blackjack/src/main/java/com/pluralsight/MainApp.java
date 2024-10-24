package com.pluralsight;

import java.util.Scanner;

public class MainApp {

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand playerHand1 = new Hand();
        Hand dealerHand = new Hand();

        deck.shuffle();

        System.out.print("Please enter your name: ");
        String player1 = userInput.nextLine();

        // deal 2 cards
        for(int i = 0; i < 2; i++) {
            // deal that card to the hand
            playerHand1.deal(deck.deal());
            dealerHand.deal(deck.deal());
        }

        int playerHandValue = playerHand1.getValue();
        System.out.println("The player hand is worth " + playerHandValue);

        int dealerHandValue = dealerHand.getValue();
        System.out.println("Dealers hand is worth " + dealerHandValue);

        if(playerHandValue > dealerHandValue) {
            System.out.println(String.format("%s Won!", player1));
        } else {
            System.out.println("Dealer Won!");
        }
    }
}