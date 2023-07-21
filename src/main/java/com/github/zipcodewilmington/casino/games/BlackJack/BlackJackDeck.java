package com.github.zipcodewilmington.casino.games.BlackJack;

import java.util.ArrayList;
import com.github.zipcodewilmington.casino.games.Card;

public class BlackJackDeck {
    private ArrayList<BlackJackCard> deck;

    public BlackJackDeck() {


        deck = new ArrayList<BlackJackCard>();
    }

    public void addCard(BlackJackCard blackjackcard) {
        deck.add(blackjackcard);  //this adds a single card to the deck
    }

    public String toString() {
        //the string will return every single card in the deck
        String output = "";
        for (BlackJackCard card : deck) {
            output += card;
            output += "\n";
        }
        return output;
    }

    public BlackJackDeck(boolean makeBlackJackDeck) {
        deck = new ArrayList<BlackJackCard>();
        if (makeBlackJackDeck) {
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    deck.add(new BlackJackCard(suit, rank));
                }

            }
        }
    }


    public void shuffle() {
        ArrayList<BlackJackCard> shuffle = new ArrayList<BlackJackCard>();
        while (deck.size() > 0) {

            int cardToPull = (int) (Math.random() * (deck.size() - 1));
            shuffle.add(deck.get(cardToPull));
            deck.remove(cardToPull);
        }
        deck = shuffle;

    }
    public BlackJackCard takeBlackJackCard() {
        BlackJackCard cardToTake = new  BlackJackCard(deck.get(0));
        deck.remove(0);
        return cardToTake;
    }

    public boolean hasBlackJackCards() {
    }
}