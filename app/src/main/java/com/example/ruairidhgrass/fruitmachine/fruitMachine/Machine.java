package com.example.ruairidhgrass.fruitmachine.fruitMachine;

import android.text.Selection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Machine {

    private Fruit reelOne;
    private Fruit reelTwo;
    private Fruit reelThree;

    private String prefix;
    private String line;
    private String pipe;
    private String winnerMessage;
    private String losingMessage;
    private String postfix;
    private int coins;

    Player player;

    public Machine(int coins) {
        this.coins = coins;
        this.prefix = "@@ CODECLAN FRUIT MACHINE @@";
        this.line = "=================================";
        this.pipe = "<|>";
        this.winnerMessage = "Congratulations, you have won £";
        this.losingMessage = "No wins, try again, ";
        this.postfix = "Your remaining credit is £";
        this.player = new Player(20);

//        this.outcome = this.spin();
    }

    public Fruit getRandomFruit() {
        Fruit[] fruits = {Fruit.CHERRY, Fruit.LEMON, Fruit.PLUM};
        Random rand = new Random();
        int index = rand.nextInt(fruits.length);
        return fruits[index];
    }

    public void setReelOne() {
        this.reelOne = getRandomFruit();
    }

    public void setReelTwo() {
        this.reelTwo = getRandomFruit();
    }

    public void setReelThree() {
        this.reelThree = getRandomFruit();
    }


    public void spin() {
        this.setReelOne();
        this.setReelTwo();
        this.setReelThree();
    }

    public Fruit getReelOne() {
        return reelOne;
    }

    public Fruit getReelTwo() {
        return reelTwo;
    }

    public Fruit getReelThree() {
        return reelThree;
    }

    public String play() {

        Fruit reelOne = getReelOne();
        Fruit reelTwo = getReelTwo();
        Fruit reelThree = getReelThree();

        player.coins -= 1;

        System.out.println(prefix);
        System.out.println(line);

        if ((reelOne == Fruit.CHERRY) && (reelTwo == Fruit.CHERRY) && (reelThree == Fruit.CHERRY)) {
            player.coins += Winner.CHERRYWINS.getWinnings();
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
            System.out.println(line);
            System.out.println(winnerMessage + Winner.CHERRYWINS.getWinnings());
            System.out.println(postfix + player.checkCoins());

        } else if ((reelOne == Fruit.LEMON) && (reelTwo == Fruit.LEMON) && (reelThree == Fruit.LEMON)) {
            player.coins += Winner.LEMONWINS.getWinnings();
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
            System.out.println(line);
            System.out.println(winnerMessage + Winner.LEMONWINS.getWinnings());
            System.out.println(postfix + player.checkCoins());

        } else if ((reelOne == Fruit.PLUM) && (reelTwo == Fruit.PLUM) && (reelThree == Fruit.PLUM)) {
            player.coins += Winner.PLUMWINS.getWinnings();
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
            System.out.println(line);
            System.out.println(winnerMessage + Winner.PLUMWINS.getWinnings());
            System.out.println(postfix + player.checkCoins());

        } else {
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
            System.out.println(line);
            System.out.println(losingMessage);
            System.out.println(postfix + player.checkCoins());
            return losingMessage;
        }
        return losingMessage;


        //    public Fruit[] spin() {
//        Fruit one = this.getRandomFruit();
//        Fruit two = this.getRandomFruit();
//        Fruit three = this.getRandomFruit();
//        Fruit[] outcomeArray = {one, two, three};
//        return outcomeArray;
//    }

//    public boolean checkWin(){
//        if (outcome[0] == outcome[1] && outcome[1] == outcome[2]) {
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//
//     public int win() {
//         if (checkWin()) {
//             System.out.println("outcome = " + outcome[0].getValue());
//             return outcome[0].getValue();
//         }
//         return 0;
//     }

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

}
