package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CasinoWarTest {

    private CasinoWar game;

    @BeforeEach
    public void setUp() {
        game = new CasinoWar();

    }

    @org.junit.Test
    public void testPlayCasinoWar() {
        CasinoWar runnable = new CasinoWar();
        runnable.playCasinoWar();
        Assert.assertNotNull(runnable.toString());
    }

    @Test
    void testDeclareWinner() {

        int playerScore = 0;
        int actual = playerScore + 1;
        Assertions.assertEquals(1, actual);

    }
}
