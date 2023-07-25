package com.github.zipcodewilmington.casino.games.RideTheBus;

import com.github.zipcodewilmington.casino.games.Card;
import com.github.zipcodewilmington.casino.games.RideTheBus.RideTheBusGame;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RideTheBusGameTest {

    @Test
    void testGetWallet() {
        RideTheBusPlayer player = new RideTheBusPlayer();
        player.setWallet(10000.0);
        double f = player.getWallet();
        Assert.assertEquals(10000.0, f, 0);
    }


    @Test
    void testSetWallet() {
        RideTheBusPlayer player = new RideTheBusPlayer();
        player.setWallet(50000.0);
        double f = player.getWallet();
        Assert.assertEquals(50000.0, f, 0);
    }


    @Test
    void testGetCurrentBet() {
        RideTheBusPlayer player = new RideTheBusPlayer();
        player.currentBet = 50;
        double f = player.getCurrentBet();
        Assert.assertEquals(50, f, 0);
    }


    @Test
    void tesetSetCurrentBet() {
        RideTheBusPlayer player = new RideTheBusPlayer();
        player.setCurrentBet(50);
        int f = player.getCurrentBet();
        Assert.assertEquals(f, 50);
    }


    @Test
    void testHop() {
        RideTheBusGame ride = new RideTheBusGame();
        ride.hop();
        int index = ride.index0;
        Assert.assertEquals(1, index);
    }

    @Test
    void testBack()
    {
    RideTheBusGame ride = new RideTheBusGame();
    ride.index0 = 3;
    ride.back();
    Assert.assertEquals(ride.index0,2);
    }

    @Test
    void testDeal()
    {
        RideTheBusGame ride = new RideTheBusGame();
        ride.deal();
        Assert.assertTrue(ride.table[0]!=null);
    }

    @Test
    void testcheckHiLow()
            //This test needs to be altered because it is relying on random values.
    {
        RideTheBusGame rider = new RideTheBusGame();
        rider.deal();
       boolean f= rider.checkHiLow("higher");
        Assert.assertTrue(f);
    }

    @Test
    void testReact()
    {
        RideTheBusGame rider = new RideTheBusGame();
        rider.react(true);
        Assert.assertEquals(rider.getIndex0(),1);
    }



    @Test
    void testgetIndex()
    {
        RideTheBusGame rider = new RideTheBusGame();
        int f =rider.getIndex0();
        Assert.assertEquals(f,0);
    }



}




    // Add more test cases using @Test annotations as needed

