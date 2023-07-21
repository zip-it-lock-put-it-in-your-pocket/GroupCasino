package com.github.zipcodewilmington.casino.games.RideTheBus;

public class RideTheBusPlayer {


    double wallet =0;
    int currentBet=0;
    public RideTheBusPlayer()
    {
        this.wallet = 10000;
    }


    public double getWallet() {
        return wallet;
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
