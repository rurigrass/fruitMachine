package com.example.ruairidhgrass.fruitmachine;

import com.example.ruairidhgrass.fruitmachine.fruitMachine.Player;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class playerTest {

    Player player;

    @Before
    public void before() {
        player = new Player(20);
    }

    @Test
    public void canCheckCoins() {
        assertEquals(20, player.CheckCoins());
    }


//    @Test
//    public void canBet() {
//        player.bet();
//
//    }
}
