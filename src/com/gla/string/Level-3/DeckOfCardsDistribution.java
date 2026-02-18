package com.gla.string;

import java.util.Random;
import java.util.Scanner;

public class DeckOfCardsDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int players = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Enter cards per player: ");
        int cardsPerPlayer = Integer.parseInt(scanner.nextLine().trim());

        if (players <= 0 || cardsPerPlayer <= 0) {
            System.out.println("Invalid players or cards count.");
            scanner.close();
            return;
        }
        if (players * cardsPerPlayer > 52) {
            System.out.println("Not enough cards for distribution.");
            scanner.close();
            return;
        }

        String[] deck = createDeck();
        shuffleDeck(deck);
        String[][] hands = distribute(deck, players, cardsPerPlayer);

        for (int i = 0; i < hands.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < hands[i].length; j++) {
                System.out.println(hands[i][j]);
            }
        }
        scanner.close();
    }

    private static String[] createDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] deck = new String[52];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    private static void shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    private static String[][] distribute(String[] deck, int players, int cardsPerPlayer) {
        String[][] hands = new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                hands[i][j] = deck[index++];
            }
        }
        return hands;
    }
}

