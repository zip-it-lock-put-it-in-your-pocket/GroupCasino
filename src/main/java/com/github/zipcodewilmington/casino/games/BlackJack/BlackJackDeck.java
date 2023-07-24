package com.github.zipcodewilmington.casino.games.BlackJack;

import java.util.ArrayList;
import java.util.Collections;

import com.github.zipcodewilmington.casino.games.Card;

public class BlackJackDeck {
    private ArrayList<BlackJackCard> deck;

    public BlackJackDeck() {

        deck = new ArrayList<BlackJackCard>();
    }

    public ArrayList<BlackJackCard> getBlackJackCards() {
        return deck;
    }

    public BlackJackDeck(BlackJackDeck bjd){
        Collections.copy(this.deck, bjd.getBlackJackCards());
    }

    public void addBlackJackCard(BlackJackCard blackjackcard) {
        deck.add(blackjackcard);  //this adds a single card to the deck
    }
    public void addBlackJackCards(ArrayList<BlackJackCard> blackJackCards){
        deck.addAll(blackJackCards);
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
        if (deck.size()>0){
            return true;
        }
        else{
            return false;
        }
    }

    public void reloadBlackJackDeckFromDiscard(BlackJackDeck discard) {
        this.addBlackJackCards(discard.getBlackJackCards());
        this.shuffle();
        discard.emptyBlackJackDeck();
        System.out.println("Ran out of cards, creating new deck from discard pile & shuffling deck.");
    }
    public int blackJackCardsLeft(){return deck.size();}

    public void emptyBlackJackDeck(){deck.clear();}
}