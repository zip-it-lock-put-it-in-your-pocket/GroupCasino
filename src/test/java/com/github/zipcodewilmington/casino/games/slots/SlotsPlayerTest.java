package com.github.zipcodewilmington.casino.games.slots;

import com.github.zipcodewilmington.casino.CasinoAccount;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlotsPlayerTest {

    @Test
    void placeBet() {
        CasinoAccount f = new CasinoAccount();
        SlotsPlayer p = new SlotsPlayer(f);

        p.placeBet(500);
        int expected = p.getCurrentBet();
        Assert.assertEquals(expected,500);
    }

    @Test
    void canAffordBet() {
        CasinoAccount f = new CasinoAccount();
        SlotsPlayer p = new SlotsPlayer(f);
        p.setWallet(5000);
        Assert.assertFalse(p.canAffordBet(50000));


    }

    @Test
    void canAffordBet2() {
        CasinoAccount f = new CasinoAccount();
        SlotsPlayer p = new SlotsPlayer(f);
        p.setWallet(5000);
        Assert.assertTrue(p.canAffordBet(500));


    }

    @Test
    void resetBet() {

        CasinoAccount f = new CasinoAccount();
        SlotsPlayer p = new SlotsPlayer(f);
        p.placeBet(400);
        p.resetBet();
        int r = p.getCurrentBet();
        Assert.assertEquals(r,0);



    }

    @Test
    void resetBet2() {

        CasinoAccount f = new CasinoAccount();
        SlotsPlayer p = new SlotsPlayer(f);
        p.placeBet(50000);
        p.resetBet();
        int r = p.getCurrentBet();
        Assert.assertEquals(r,0);



    }

    @Test
    void isActive()
    {
        CasinoAccount f = new CasinoAccount();
        SlotsPlayer p = new SlotsPlayer(f);
        p.setActive();
        Assert.assertTrue(p.isActive());
    }



    @Test
    void setActive() {
    }

    @Test
    void getWallet() {
    }

    @Test
    void setWallet() {
    }
}