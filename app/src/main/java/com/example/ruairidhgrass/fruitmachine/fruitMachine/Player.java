package com.example.ruairidhgrass.fruitmachine.fruitMachine;

public class Player {

    protected int coins;

    public Player(int coins) {
        this.coins = coins;
    }


    public int CheckCoins() {
        return this.coins;
    }
}
