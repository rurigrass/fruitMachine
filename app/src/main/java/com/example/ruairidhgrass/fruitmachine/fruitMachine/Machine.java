package com.example.ruairidhgrass.fruitmachine.fruitMachine;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Machine extends Player {

    Fruit[] outcome;

    public Machine(int coins) {
        super(coins);
        this.outcome = this.spin();
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

    public boolean checkWin(){
        if (outcome[0] == outcome[1] && outcome[1] == outcome[2]) {
            return true;
        }
        else {
            return false;
        }
    }

     public int win() {
         if (checkWin()) {
             return outcome[0].getValue();
         }
         return 0;
     }

    //    public int win() {
//        Fruit[] cherryArray = {Fruit.CHERRY, Fruit.CHERRY, Fruit.CHERRY};
//        Fruit[] plumArray = {Fruit.PLUM, Fruit.PLUM, Fruit.PLUM};
//        Fruit[] lemonArray = {Fruit.LEMON, Fruit.LEMON, Fruit.LEMON};
//        Fruit[] outcome = this.spin();
//
//
//        if (outcome.equals(cherryArray)){return Winner.CHERRYWINS.getWinnings();}
//        else if (outcome.equals(plumArray)){return Winner.PLUMWINS.getWinnings();}
//        else if (outcome.equals(lemonArray)){return Winner.LEMONWINS.getWinnings();}
//        else return 0;


        //        for (Fruit fruit : outcome) {
//
//            for (Fruit cherry : cherryArray) {
//                if (fruit == cherry)  {
//                    return Winner.CHERRYWINS.getWinnings();
//                }
//            }
//
//            for (Fruit plum : plumArray) {
//                if (fruit == plum) {
//                    return Winner.PLUMWINS.getWinnings();
//                }
//            }
//
//            for (Fruit lemon : lemonArray) {
//                if (fruit == lemon) {
//                    return Winner.LEMONWINS.getWinnings();
//                }
//            }
//
//        }
//
//        return 0;








}
