package com.github.zipcodewilmington.casino.games.BlackJack;

/**
 * Contains the suits of a Card, Names
 */
public enum BlackJackSuit {
    CLUB("Clubs"),
    DIAMOND("Diamonds"),
    HEART("Hearts"),
    SPADE("Spades");

    String suitName;

    BlackJackSuit(String suitName) {
        this.suitName = suitName;
    }

    public String toString(){
        return suitName;
    }
}