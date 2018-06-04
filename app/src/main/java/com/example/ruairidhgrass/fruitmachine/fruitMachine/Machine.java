package com.example.ruairidhgrass.fruitmachine.fruitMachine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Machine extends Player {


    public Machine(int coins) {
        super(coins);
    }

    public Fruit getRandomFruit() {
        Fruit[] fruits = Fruit.values();
        Random rand = new Random();
        int index = rand.nextInt(fruits.length);
        return fruits[index];
    }

    public Fruit[] spin() {
        Fruit one = this.getRandomFruit();
        Fruit two = this.getRandomFruit();
        Fruit three = this.getRandomFruit();
        Fruit[] outcome = {one, two, three};
        return outcome;
    }

    public int win() {
        Fruit[] cherryArray = {Fruit.CHERRY, Fruit.CHERRY, Fruit.CHERRY};
        Fruit[] plumArray = {Fruit.PLUM, Fruit.PLUM, Fruit.PLUM};
        Fruit[] lemonArray = {Fruit.LEMON, Fruit.LEMON, Fruit.LEMON};
        Fruit[] jackpot = this.spin();

        if (jackpot.equals(cherryArray)){return Winner.CHERRYWINS.getWinnings();}
        else if (jackpot.equals(plumArray)){return Winner.PLUMWINS.getWinnings();}
        else if (jackpot.equals(lemonArray)){return Winner.LEMONWINS.getWinnings();}
        return 0;
    }









}
