package com.github.zipcodewilmington.casino.games.RideTheBus;

import com.github.zipcodewilmington.casino.games.Card;
import com.github.zipcodewilmington.casino.games.RideTheBus.RideTheBusGame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RideTheBusGameTest {

    RideTheBusGame rideTheBusGame = new RideTheBusGame();

    @Test
    public void testCheckBet() {

        rideTheBusGame.getRider().setWallet(100); // Set wallet balance to 100
        int bet = 50;
        assertTrue(rideTheBusGame.checkbet(bet));
    }

    @Test
    public void testtInsufficientFunds() {
        RideTheBusPlayer rider = new RideTheBusPlayer();
        rider.setWallet(100);
        int bet = 150;
        assertFalse(rideTheBusGame.checkbet(bet));
    }

    @Test
    public void testCheckHiLow() {
        rideTheBusGame.index0 = 0;
        rideTheBusGame.table[0] = new Card("Diamonds", 13,"Red","diamonds");
        boolean result = rideTheBusGame.checkHiLow("higher");
        assertTrue(result);

        result = rideTheBusGame.checkHiLow("lower");
        assertFalse(result);
    }

    @Test
    public void testCheckColor() {
        rideTheBusGame.index0 = 2;
        rideTheBusGame.table[2] = new Card("Diamonds", 5, "black","clubs");
        boolean result = rideTheBusGame.checkColor("red");
        assertFalse(result);

        result = rideTheBusGame.checkColor("black");
        assertTrue(result);
    }

    @Test
    public void testCheckSuit() {
        rideTheBusGame.index0 = 3;
        rideTheBusGame.table[3] = new Card("5", 5,"red","diamonds");
        boolean result = rideTheBusGame.checkSuit("spades");
        assertFalse(result);

        result = rideTheBusGame.checkSuit("diamonds");
        assertTrue(result);
    }




    // Add more test cases using @Test annotations as needed
}
