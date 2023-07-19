package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class warGameTest {
    private warGame game;

    @BeforeEach
    public void setUp(){
        game = new warGame();
    }

    @Test
    void testDealCards(int Player1HandSize){
        game.dealCards();

        int expectedSize = 26;
        int player1HandSize = game.getPlayer1().getHand().size;
        int dealerHandSize = game.getdealer().getHand().size;

        Assertions.assertEquals(expectedSize, Player1HandSize);
        Assertions.assertEquals(expectedSize, dealerHandSize);
    }

    @Test
    void testPlayGame(){
        game.play();

        return;
    }

    @Test
    void testWar(){
        return;
    }

    @Test
    void testCompareCards(){

    }




}