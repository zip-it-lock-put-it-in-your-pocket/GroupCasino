package com.github.zipcodewilmington.casino.games.BlackJack;

import java.util.ArrayList;
import com.github.zipcodewilmington.casino.games.Card;
import com.github.zipcodewilmington.casino.games.Deck;
public class Hand {
    private ArrayList<BlackJackCard> hand;
    public Hand(){
        hand = new ArrayList<BlackJackCard>();
    }
    public void takeBlackJackCardFromDeck(BlackJackDeck deck){
        hand.add(deck.takeBlackJackCard());
    } public void discardHandToBlackJackDeck(BlackJackDeck discardBlackJackDeck) {
        discardBlackJackDeck.addBlackJackCards(hand);

        hand.clear();
    }
    public String toString() {
      String output = "";
      for(BlackJackCard card: hand){
          output += card + " - ";
      }
      return output;
    }
    public int calculatedValue(){
        int value = 0;
        int aceCount = 0;

        for (BlackJackCard card : hand){
            value += card.getValue();

            if(card.getValue() == 11){
                aceCount ++;
            }
        }if (value > 21 && aceCount > 0){
            while (aceCount > 0 && value >21){
                aceCount --;
                value -= 10;
            }
        } return value;
    }
}

