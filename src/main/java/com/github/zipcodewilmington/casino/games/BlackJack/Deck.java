package com.github.zipcodewilmington.casino.games.BlackJack;

import java.util.ArrayList;


public class Deck {
    private ArrayList<Card> deck;

    public Deck() {


        deck = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        deck.add(card);  //this adds a single card to the deck
    }

    public String toString() {
        //the string will return every single card in the deck
        String output = "";
        for (Card card : deck) {
            output += card;
            output += "\n";
        }
        return output;
    }

    public Deck(boolean makeDeck) {
        deck = new ArrayList<Card>();
        if (makeDeck) {
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    deck.add(new Card(suit, rank));
                }

            }
        }
    }



    public void shuffle() {
        ArrayList<Card> shuffle = new ArrayList<Card>();
        while (deck.size() > 0) {

            int cardToPull = (int) (Math.random() * (deck.size() - 1));
            shuffle.add(deck.get(cardToPull));
            deck.remove(cardToPull);
        }
        deck = shuffle;

    }
}