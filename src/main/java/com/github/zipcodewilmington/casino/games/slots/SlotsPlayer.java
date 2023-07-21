package com.github.zipcodewilmington.casino.games.slots;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsPlayer {

    int CurrentBet = 0;
    int wallet = 10000;
    boolean active = true;

    public SlotsPlayer() {
    }

    public void placeBet(int bet) {
        CurrentBet = bet;

    }


    public boolean canAffordBet(int bet) {
        if (bet > this.getWallet()) {
            return false;
        } else return true;
    }


    public void resetBet()
    {
        CurrentBet = 0;
    }

    public boolean isActive() {
        return true;
    }

    public void setActive()
    {
        active = true;
    }


        public int getWallet()

        {
        return wallet;
         }

    public void setWallet(int wallet)
        {
        this.wallet = wallet;
        }
}
