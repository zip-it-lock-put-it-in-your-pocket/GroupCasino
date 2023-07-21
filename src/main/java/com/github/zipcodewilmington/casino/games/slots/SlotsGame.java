package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.games.RideTheBus.RideTheBusPlayer;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

import java.util.Random;
import java.util.Scanner;
public class SlotsGame {
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    private IOConsole colorConsole = new IOConsole(AnsiColor.RED);
    String wordone="";
    String wordtwo="";
    String wordthree="";

    boolean hit = false;
    String[]Words = {"APPLE","PEAR","PEACH","ORANGE","WATERMELON","APPLE","STRAWBERRY","KIWI","RASBERRY","BLUEBERRY"};

    SlotsPlayer slotsPlayer;
    public void run() throws InterruptedException {
        slotsPlayer = new SlotsPlayer();
        while(!checkbet(getBet()));
        WelcomeMessage();
        pushToStart();
        roll();
        didWin();
        }


    public void roll() throws InterruptedException {
        for (int i = 0; i < 10; i++)
        {
            SlotRoll();
        }
    }

    public int getBet()
    {
        System.out.println("How much would you like to bet inside slots?");
        System.out.println("Your account has: " + slotsPlayer.getWallet());
        int b= scan.nextInt();
        scan.nextLine();
        return b;
    }

    public boolean checkbet(int bet)
    {
        if(bet>slotsPlayer.getWallet())
        {
            System.out.println("You do not have enough funds in your wallet for the bet you just made.");
            System.out.println("Your account has: " + slotsPlayer.getWallet());
            return false;
        }
        slotsPlayer.placeBet(bet);
        slotsPlayer.setWallet(slotsPlayer.wallet-bet);
        System.out.println("You bet has been set.");
        return true;
    }
    public void spacer()
    {
        for(int i =0;i<9;i++)
        {
            System.out.println("");
        }
    }

    public String WelcomeMessage()
    {
        StringBuilder welcome = new StringBuilder();
        welcome.append("--------------------------------\n");
        welcome.append("         WELCOME TO SLOTS       \n");
        welcome.append("                                \n");
        welcome.append("  Please enter any key to roll  \n");
        welcome.append("--------------------------------\n");
        System.out.println(welcome.toString());
        return welcome.toString();
    }

    public void pushToStart()
    {
        scan.nextLine();
    }



    public void assignWords()
    {
        String ret="";
        String ret2="";
        String ret3="";
        for(int i=0;i<3;i++)
        {
            int index = rand.nextInt(10);
            ret="      " + Words[index];
            if(i==0)
            {
                wordone=Words[index];
            }
            else if(i==1)
            {
                wordtwo=Words[index];
                ret2="      " + Words[index];
            }
            else
            {
                wordthree=Words[index];
                ret3="      " + Words[index];
            }

        }
        PrintWords(ret, ret2, ret3);
    }

    public void PrintWords(String ret, String ret2,String  ret3)
    {
        colorConsole.print(ret);
        colorConsole.print(ret2);
        colorConsole.print(ret3);
    }
    public void AdjustBank(boolean didWin)
    {
        if(didWin==true)
        {
            slotsPlayer.placeBet(slotsPlayer.CurrentBet*3);
        }
        else if (didWin==false)
        {
           slotsPlayer.placeBet((int) (slotsPlayer.CurrentBet - slotsPlayer.CurrentBet*.10));
        }
    }
    public boolean didWin() throws InterruptedException {
        if (wordone.equals(wordtwo) && wordtwo.equals(wordthree)) {
            System.out.println("YOU WIN");
            return true;
        }
        return false;
    }
    public void SlotRoll() throws InterruptedException
    {
      assignWords();
        spacer();
        Thread.sleep(425);
        }






    }

