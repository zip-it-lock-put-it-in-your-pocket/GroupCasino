package com.github.zipcodewilmington.casino.games.RideTheBus;

import com.github.zipcodewilmington.casino.games.Card;
import com.github.zipcodewilmington.casino.games.Deck;

import java.util.Scanner;

public class RideTheBus {

    Deck deckobj = new Deck();
    Card[]table = new Card[4];
    int index0;
    Scanner scan = new Scanner(System.in);


    public void hop()
    {
        index0=index0+1;
    }
    public void back()
    {
        index0=index0-1;
    }

    public void deal(){

        for (int i =0; i<4;i++)
        {
            table[i] = deckobj.GetRandomCard();
        }
    }




    public void HalfBet(){}

    public String getValue(){
        return table[index0].toString();
    }



    public void reset(){}

    public void exitGame(){}

    public void start()
    {
        WelcomeMessage();
        deal();
        while(index0<4) {
            gameflow();
        }
    }
    public String guessHiLow() {
        System.out.println("Do you believe the next card turned will be higher or lower?");
        return scan.nextLine().toLowerCase();
    }

    public boolean checkHiLow(String guess) {
        if (guess.equals("higher")) {
            int current = table[index0].value;
            table[index0] = deckobj.GetRandomCard();
            System.out.println("The next card turned over was " + table[index0]);
            int NewCard = table[index0].value;
            return current < NewCard;
        } else if (guess.equals("lower"))
        {
            int current = table[index0].value;
            table[index0] = deckobj.GetRandomCard();
            System.out.println("The next card turned over was " + table[index0]);
            int NewCard = table[index0].value;
            return current > NewCard;
        }
        return true;
    }
    public void react(boolean logic) {
        if (logic == true)
        {
            System.out.println("Your guess was right, moving up!");
            hop();
        } else if (logic == false)
        {
            if (getIndex0() != 0)
            {
                System.out.println("Your guess was wrong, moving back!");
                back();
            }
            else
                System.out.println("Your guess was wrong but you're still at spot one.");
        }
    }

    public boolean checkColor(String guess) {
        if (guess.equals("red")) {

            table[index0] = deckobj.GetRandomCard();
            System.out.println("The card turned over was " + table[index0]);
            String NewColor = table[index0].color.toLowerCase();
            return guess.equals(NewColor);
        } else if (guess.equals("black"))
        {

            table[index0] = deckobj.GetRandomCard();
            System.out.println("The card turned over was " + table[index0]);
            String NewColor = table[index0].color.toLowerCase();
            return guess.equals(NewColor);
        }
        return true;
    }

    public boolean checkSuit(String guess) {


        table[index0] = deckobj.GetRandomCard();
        System.out.println("The card turned over was " + table[index0]);
        String NewSuit = table[index0].suit.toLowerCase();
        return guess.equals(NewSuit);
    }



    public void gameflow() {
        if (index0 == 0 || index0 == 1) {
            reveal();
            react(checkHiLow(guessHiLow()));
        } else if (index0 == 2)
        {
            react(checkColor(guessColor()));
        }
        else if(index0==3) {
            react(checkSuit(guessSuit()));
        }
    }

    public String guessColor() {
        System.out.println("Please input the color of the next card flipped over.");
        return scan.nextLine().toLowerCase();
    }

    public String guessSuit() {
        System.out.println("Please input the suit of the next card flipped over.");
        return scan.nextLine();
    }

    public void reveal() {

        System.out.println( "The current value of the card you are guessing is " + getValue());
    }

    public void WelcomeMessage() {

        System.out.println( "Welcome to Ride The Bus!");

    }
    public int getIndex0() {
        return index0;
    }
    public void status(){}


}
