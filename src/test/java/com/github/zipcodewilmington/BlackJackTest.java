package com.github.zipcodewilmington;
import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.games.BlackJack.*;
import com.github.zipcodewilmington.casino.games.DiceRoll;
import com.github.zipcodewilmington.casino.games.StreetCraps;
import com.github.zipcodewilmington.casino.games.slots.SlotsPlayer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;


class BlackJackTest {



    @Test
    public void testBlackJackSetter() {
        BlackJackPlayer blackJackPlayer = new BlackJackPlayer();
        blackJackPlayer.setName("Bob");


        String actual = blackJackPlayer.getName();
        String expected = "Bob";

        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testBlackJackGetter()
    {
       BlackJackPlayer blackJackPlayer = new BlackJackPlayer();
       String expected = blackJackPlayer.getName();
        String actual = "Player";
        Assert.assertEquals(actual,expected);
    }

    @Test
            public void testJack()
    {
    BlackJackCard blackjackcard = new BlackJackCard(BlackJackSuit.CLUB,BlackJackRankEnum.JACK);
    int actual = blackjackcard.getValue();
    int expected = 10;
        Assert.assertEquals(actual,expected);


    }

    @Test
    public void testKing()
    {
        BlackJackCard blackjackcard = new BlackJackCard(BlackJackSuit.CLUB,BlackJackRankEnum.KING);
        int actual = blackjackcard.getValue();
        int expected = 10;
        Assert.assertEquals(actual,expected);


    }

    @Test
    public void testQueen()
    {
        BlackJackCard blackjackcard = new BlackJackCard(BlackJackSuit.CLUB,BlackJackRankEnum.QUEEN);
        int actual = blackjackcard.getValue();
        int expected = 10;
        Assert.assertEquals(actual,expected);
    }




}

