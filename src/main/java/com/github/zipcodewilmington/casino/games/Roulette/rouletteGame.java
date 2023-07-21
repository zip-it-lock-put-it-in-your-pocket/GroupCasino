package com.github.zipcodewilmington.casino.games.Roulette;
import java.util.Random;
import java.util.Scanner;


public class rouletteGame{

    static Random rand  = new Random();
    static Scanner scan = new Scanner(System.in);


    public void run() {
       WelcomeMessage();
       pushToStart();
       rouletteMenu();



    }


    public String WelcomeMessage()
    {
        StringBuilder welcome = new StringBuilder();
        welcome.append("--------------------------------\n");
        welcome.append("         WELCOME TO ROULETTE    \n");
        welcome.append("                                \n");
        welcome.append("  Please enter any key to roll  \n");
        welcome.append("--------------------------------\n");
        System.out.println(welcome);
        return welcome.toString();
    }

    public void pushToStart(){
        {
            scan.nextLine();
        }
    }

    public String rouletteMenu(){
        while (true) {
            System.out.println("\n Main Menu: Choose Number For Bet \n");
            System.out.println(" 1. Bet on Color: Green/Red/Black");
            System.out.println("2. Bet on Odd or Even");
            System.out.println("3. Leave Table");

            System.out.println("Please make a selection [1-3]: ");



        }








}





}
