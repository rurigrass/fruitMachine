package com.example.ruairidhgrass.fruitmachine.fruitMachine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Machine {


    public Machine() {
    }

    public Fruit getRandomFruit() {
        Fruit[] fruits = Fruit.values();
        Random rand = new Random();
        int index = rand.nextInt(fruits.length);
        return fruits[index];
    }

    public Fruit[] Spin() {
        Fruit one = this.getRandomFruit();
        Fruit two = this.getRandomFruit();
        Fruit three = this.getRandomFruit();
        Fruit[] outcome = {one, two, three};
        return outcome;
    }



}
