package com.github.zipcodewilmington;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CasinoWar {

        public static void main(String[] args) {
            playCasinoWar();
        }

        static void playCasinoWar() {
            Scanner scanner = new Scanner(System.in);

        // Change to call deck
            List<String> deck = createShuffledDeck();

            int playerScore = 0;
            int dealerScore = 0;

            while (!deck.isEmpty()) {
                // Player's turn
                System.out.println("Press Enter to draw a card.");
                scanner.nextLine();
                String playerCard = drawCard(deck);
                System.out.println("You drew: " + playerCard);
                int playerCardValue = getCardValue(playerCard);

                // Dealer's turn
                System.out.println("Press Enter for the dealer to draw a card.");
                scanner.nextLine();
                String dealerCard = drawCard(deck);
                System.out.println("Dealer drew: " + dealerCard + "\n");
                int dealerCardValue = getCardValue(dealerCard);

                // Compare the cards
                if (playerCardValue > dealerCardValue) {
                    System.out.println("You win this round!");
                    playerScore++;
                } else if (dealerCardValue > playerCardValue) {
                    System.out.println("Dealer wins this round!");
                    dealerScore++;
                } else {
                    System.out.println("It's a tie! Time for war!");
                    // War: draw three more cards each
                    List<String> playerWarCards = new ArrayList<>();
                    List<String> dealerWarCards = new ArrayList<>();

                    for (int i = 0; i < 2; i++) {
                        playerWarCards.add(drawCard(deck));
                        dealerWarCards.add(drawCard(deck));
                    }

                    // Get the fourth card for comparison
                    String playerFourthCard = drawCard(deck);
                    String dealerFourthCard = drawCard(deck);

                    System.out.println("Your fourth card: " + playerFourthCard);
                    System.out.println("Dealer's fourth card: " + dealerFourthCard);

                    int playerFourthCardValue = getCardValue(playerFourthCard);
                    int dealerFourthCardValue = getCardValue(dealerFourthCard);

                    if (playerFourthCardValue > dealerFourthCardValue) {
                        System.out.println("You win the war!");
                        playerScore++;
                    } else if (dealerFourthCardValue > playerFourthCardValue) {
                        System.out.println("Dealer wins the war!");
                        dealerScore++;
                    } else {
                        System.out.println("It's a tie in the war too! Nobody wins.");
                    }
                }


                // Display the current scores
                System.out.println("Your score: " + playerScore);
                System.out.println("Dealer's score: " + dealerScore);
                // Check if the deck is empty
                if (deck.isEmpty()) {
                    System.out.println("The deck is empty. Game over!");
                    break;
                }


                // Ask the player if they want to continue playing
                System.out.println("\n Press enter to play again or (exit) to leave.");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Thanks for playing! Final scores:");
                    System.out.println("Your score: " + playerScore);
                    System.out.println("Dealer's score: " + dealerScore);
                    break;
                }
            }

            scanner.close();
        }

        private static List<String> createShuffledDeck() {
            List<String> deck = new ArrayList<>();

            String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
            String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

            for (String suit : suits) {
                for (String rank : ranks) {
                    deck.add(rank + " of " + suit);
                }
            }


            Collections.shuffle(deck);
            return deck;
        }

        private static String drawCard(List<String> deck) {
            return deck.remove(deck.size() - 1);
        }

        private static int getCardValue(String card) {
            String rank = card.split(" ")[0];
            switch (rank) {
                case "Ace":
                    return 14;
                case "King":
                    return 13;
                case "Queen":
                    return 12;
                case "Jack":
                    return 11;
                default:
                    return Integer.parseInt(rank);
            }
        }


}


