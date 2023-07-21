package com.github.zipcodewilmington.casino.games.BlackJack;

public enum Suit {


    CLUB("Clubs"),
    DIAMOND("Diamonds"),
    HEART("Hearts"),
    SPADE("Spades");
    String suitName;

    Suit(String suitName) {
        this.suitName = suitName;
    }

    public String toString() {
        return suitName;

    }
}


