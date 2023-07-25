package com.github.zipcodewilmington.casino.games.BlackJack;
import java.util.Scanner;
public class BlackJackPlayer extends Person {
    Scanner input = new Scanner(System.in);
    public BlackJackPlayer(){

        super.setName("Player");
    }
    public void makeDecision(BlackJackDeck blackJackDeck, BlackJackDeck discard) {
        int decision = 0;
        boolean getNum = true;
        while (getNum) {
            try {
                System.out.println("Would you like to : 1) Hit or 2) Stand");
                decision = input.nextInt();
                getNum = false;
            } catch (Exception e) {
                System.out.println("Invalid");
                input.next();
            }

        }
        if (decision == 1) {
            this.hit(blackJackDeck, discard);
            if (this.getHand().calculatedValue() > 20) {
                return;

            } else {
                this.makeDecision(blackJackDeck, discard);
            }
            else{
                System.out.println("You stand.");
            }
        }
    }

    }public void hit(BlackJackDeck blackJackDeck, BlackJackDeck discard){

    }
}
