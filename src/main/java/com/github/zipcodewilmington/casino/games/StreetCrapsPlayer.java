package com.github.zipcodewilmington.casino.games;

import com.github.zipcodewilmington.casino.CasinoAccount;

public class StreetCrapsPlayer {
    double wallet =0;
    int currentBet=0;
    public StreetCrapsPlayer(CasinoAccount person)
    {
        this.wallet = person.getCasinoBalance();
    }
    public void placeBet(int bet) {
        currentBet = bet;
    }

    public double getWallet() {
        return wallet;
    }
    public boolean canAffordBet(int bet) {
        if (bet > this.getWallet()) {
            return false;
        } else return true;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
    public int getCurrentBet() {
        return currentBet;
    }

    public void setCurrentBet(int currentBet) {
        this.currentBet = currentBet;
    }
}
