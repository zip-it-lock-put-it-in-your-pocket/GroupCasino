package com.github.zipcodewilmington.casino.games.BlackJack;

public abstract class Person {
    private Hand hand;
    private String name;
    
    public Person(){
        this.hand = new Hand();
        this.name = "";
    } public Hand getHand(){
        return this.hand;
    } public void setHand(Hand hand){
        this.hand = hand;
    } public String getName(){
        return this.name;
    }public void setName(String name){
        this.name = name;
    }public void printHand(){
        System.out.println(this.name + "'s hand looks like this:");
        System.out.println(this.hand + " Valued at: " + this.hand.calculatedValue());
    }


    public void hit(BlackJackDeck deck, BlackJackDeck discard){

       if (!deck.hasBlackJackCards()){
           deck.reloadBlackJackDeckFromDiscard(discard);
       }
       this.hand.takeBlackJackCardFromDeck(deck);
        System.out.println(this.name + " gets a card");
        this.printHand();
    }
    public boolean hasBlackJack(){
        if (this.getHand().calculatedValue() ==21){
            return true;
        } else {
            return false;
        }
    }

}
