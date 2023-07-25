package com.github.zipcodewilmington.casino.games.BlackJack;
import com.github.zipcodewilmington.casino.games.Deck;

public class BlackJack {

    // created variables for the blackjack game class
    private int wins;
    private int losses;
    private int pushes;
    private BlackJackDeck blackJackDeck, discarded;
    private Dealer dealer;
    private BlackJackPlayer blackJackPlayer;

//created a constructor for the blackjack game class
    public BlackJack(){
        wins = 0;
        losses = 0;
        pushes = 0;//anytime a blackjack object is made it is automatically going to be 0
    blackJackDeck = new Deck(true);
    discarded = new Deck();
    dealer = new Dealer();
    blackJackPlayer = new BlackJackPlayer();
    blackJackDeck.shuffle();
    startRound();
    }
    private void startRound(){
        dealer.getHand().takeBlackJackCardFromDeck(blackJackDeck);
        dealer.getHand().takeBlackJackCardFromDeck(blackJackDeck);

        blackJackPlayer.getHand().takeBlackJackCardFromDeck(blackJackDeck);
        blackJackPlayer.getHand().takeBlackJackCardFromDeck(blackJackDeck);

        dealer.printFirstHand();
        blackJackPlayer.printHand();

        if (dealer.hasBlackJack()){
            dealer.printHand();

            if(blackJackPlayer.hasBlackJack()){
                System.out.println("You both have 21 - Push.");
                pushes++;
                startRound();
            }
            else {
                System.out.println("Dealer has BlackJack.");
                dealer.printHand();
                losses++;
                startRound();
            }
        }
        if )blackJackPlayer.hasBlackJack(){
            System.out.println("You have BlackJack! You win!");
            wins++;
            startRound();
        } blackJackPlayer.makeDecision(blackJackDeck, discarded);
    }
    //create and start the game here


}
