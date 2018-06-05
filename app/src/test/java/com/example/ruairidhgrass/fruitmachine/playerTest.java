package com.example.ruairidhgrass.fruitmachine;

import com.example.ruairidhgrass.fruitmachine.fruitMachine.Machine;
import com.example.ruairidhgrass.fruitmachine.fruitMachine.Player;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class playerTest {

    Machine machine;
    Player player;

    @Before
    public void before() {
        player = new Player(20);
    }

    @Test
    public void canCheckCoins() {
        assertEquals(20, player.checkCoins());
    }

    @Test
    public void canBetOne() {
        player.betOne();
        assertEquals(19, player.checkCoins());
    }

//    @Test
//    public void canWinCoins() {
//        machine.win();
//        assertEquals(20, player.CheckCoins());
//    }


//    @Test
//    public void canBet() {
//        player.bet();
//
//    }
}
