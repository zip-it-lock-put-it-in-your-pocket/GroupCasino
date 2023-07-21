package com.github.zipcodewilmington.casino.games.BlackJack;

public class Card {
    //vars
    private Suit suit;
    private Rank rank;

    //creates a card with a given suit and rank
    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }
    public int getValue(){
        return rank.rankValue;
    }
    public Suit getSuit(){
        return suit;
    }
    public Rank getRank() {
        return rank;
    }
    public String toString(){
        return ("["+rank+"of"+suit+"]("+this.getValue()+")");
    }
}
