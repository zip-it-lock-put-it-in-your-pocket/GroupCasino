package com.github.zipcodewilmington.casino.games;
import com.github.zipcodewilmington.casino.games.DiceRoll;

import java.util.Scanner;

public class StreetCraps {

    static int point = 0;
    double sideBet = 0;
    static int[] winningNums = {7, 11};
    static int[] losingNums = {2, 3, 12};



    static boolean win = false;
    static boolean gameover=false;

    static boolean rollagain=false;



    static Scanner in=new Scanner(System.in);


    public static void main(String[] args) {
        int currentRoll;

        while (!win && !gameover && !rollagain) {
            System.out.println("press any key to roll dice:");
            in.nextLine();
            currentRoll = rollDice();
            if(checkwin(currentRoll)){
                win=true;
            }
            else if (checkLoss(currentRoll)){
                gameover=true;
            }
            else{
                point = currentRoll;
                while(!rollagain) {
                    rollagain=rollAgain();

                }
            }


        }
    }

    public static boolean rollAgain(){
        int rolledAgainRoll;
        System.out.println("Roll again!:");
        in.nextLine();
        rolledAgainRoll=rollDice();
        if(rolledAgainRoll==point){
            System.out.println("you won");
            return true;
        } else if (rolledAgainRoll==7) {
            System.out.println("you lost");
            return true;
        }
        return false;

    }


    public static int rollDice() {
        int rollResult;
        DiceRoll.GetDiceRoll(1);
        rollResult = DiceRoll.runSimulation();
        return rollResult;

    }

    public static boolean checkwin(int currentRoll) {

        if (currentRoll == winningNums[0] || currentRoll == winningNums[1]) {
            System.out.println("YOU WON");
            return true;
        }
            return false;
    }
    public static boolean checkLoss(int currentRoll){
        if (currentRoll == losingNums[0] || currentRoll == losingNums[1] || currentRoll == losingNums[2]) {
            System.out.println("YOU LOST");
            return true;
        }
        return false;
    }
}
