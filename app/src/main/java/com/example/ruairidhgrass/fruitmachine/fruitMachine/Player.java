package com.example.ruairidhgrass.fruitmachine.fruitMachine;

public class Player {

    protected int coins;

    public Player(int coins) {
        this.coins = coins;
    }


    public int checkCoins() {
        return this.coins;
    }

    public int betOne() {
        return this.coins -= 1;
    }

}
