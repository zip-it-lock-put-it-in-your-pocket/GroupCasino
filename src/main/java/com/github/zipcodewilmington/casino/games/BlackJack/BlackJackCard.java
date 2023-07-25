package com.github.zipcodewilmington.casino.games.BlackJack;

/**
 * The Card class allows us to create cards with a Suit and a Rank
 * It contains the methods needed to get the value of the card
 * and it contains a method to print the card to the console
 */
public class BlackJackCard implements Comparable<BlackJackCard>{

     private BlackJackSuit blackJackSuit;
     private BlackJackRankEnum blackJackRankEnum;

    /**
     *
     * @param blackJackSuit  The Suit of the card to be created
     * @param blackJackRankEnum  The Rank of the card to be created
     */
    public BlackJackCard(BlackJackSuit blackJackSuit, BlackJackRankEnum blackJackRankEnum){
        this.blackJackSuit = blackJackSuit;
        this.blackJackRankEnum = blackJackRankEnum;
    }

    /**
     * Copy constructor
     * @param blackJackCard the card being copied
     */
    public BlackJackCard(BlackJackCard blackJackCard){
        this.blackJackSuit = blackJackCard.getSuit();
        this.blackJackRankEnum = blackJackCard.getRank();
    }

    /**
     *
     * @return  The numerical value of the Card
     */
    public int getValue(){
        return blackJackRankEnum.rankValue;
    }

    /**
     *
     * @return The suit of the Card.
     */
    public BlackJackSuit getSuit(){
        return blackJackSuit;
    }

    public BlackJackRankEnum getRank(){
        return blackJackRankEnum;
    }

    /**
     *
     * @return The Card as a readable string
     */
    public String toString(){
        return ("["+ blackJackRankEnum +" of "+ blackJackSuit + "] ("+this.getValue()+")");

    }

    /**
     * Compare a card to another card, returning 1 if this is higher, -1 if this is lower, in case we want to sort cards
     * @param c
     * @return
     */
    @Override
    public int compareTo(BlackJackCard c) {
        //if this card is greater than the other card
        if(this.getValue() > c.getValue()){
            return 1;
        }
        else if(this.getValue() < c.getValue()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
