package com.example.ruairidhgrass.fruitmachine.fruitMachine;

import android.text.Selection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Machine {

    private Fruit reelOne;
    private Fruit reelTwo;
    private Fruit reelThree;
    private Fruit reelFour;
    private Fruit reelFive;

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
        this.line = "==========================================";
        this.pipe = "<|>";
        this.winnerMessage = "you have won £";
        this.losingMessage = "No wins, try again, ";
        this.postfix = "Your remaining credit is £";
        this.player = new Player(10);

//        this.outcome = this.spin();
    }

    public Fruit getRandomFruit() {
        Fruit[] fruits = {Fruit.BAR, Fruit.CHERRY, Fruit.CHERRY, Fruit.PLUM, Fruit.PLUM, Fruit.PLUM, Fruit.LEMON, Fruit.LEMON, Fruit.LEMON, Fruit.LEMON};
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

    public void setReelFour() {
        this.reelFour = getRandomFruit();
    }

    public void setReelFive() {
        this.reelFive = getRandomFruit();
    }


    public void spin() {
        this.setReelOne();
        this.setReelTwo();
        this.setReelThree();
        this.setReelFour();
        this.setReelFive();
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

    public Fruit getReelFour() {
        return reelFour;
    }

    public Fruit getReelFive() {
        return reelFive;
    }

    public String play() {

        Fruit reelOne = getReelOne();
        Fruit reelTwo = getReelTwo();
        Fruit reelThree = getReelThree();
        Fruit reelFour = getReelFour();
        Fruit reelFive = getReelFive();

        player.coins -= 1;

        System.out.println(prefix);
        System.out.println(line);

            //FIVE BARS

        if ((reelOne == Fruit.BAR) && (reelTwo == Fruit.BAR) && (reelThree == Fruit.BAR) && (reelFour == Fruit.BAR) && (reelFive == Fruit.BAR)) {
            player.coins += Winner.CHERRYWINS.getWinnings();
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe);
            System.out.println(line);
            System.out.println(winnerMessage + Winner.BARWINS.getWinnings());
            System.out.println(postfix + player.checkCoins());

            //FIVE CHERRIES

        } else if ((reelOne == Fruit.CHERRY) && (reelTwo == Fruit.CHERRY) && (reelThree == Fruit.CHERRY) && (reelFour == Fruit.CHERRY) && (reelFive == Fruit.CHERRY)) {
            player.coins += Winner.CHERRYWINS.getWinnings();
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe);
            System.out.println(line);
            System.out.println(winnerMessage + Winner.CHERRYWINS.getWinnings());
            System.out.println(postfix + player.checkCoins());

            //FIVE LEMONS

        } else if ((reelOne == Fruit.LEMON) && (reelTwo == Fruit.LEMON) && (reelThree == Fruit.LEMON) && (reelFour == Fruit.LEMON) && (reelFive == Fruit.LEMON)) {
            player.coins += Winner.LEMONWINS.getWinnings();
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe);
            System.out.println(line);
            System.out.println(winnerMessage + Winner.LEMONWINS.getWinnings());
            System.out.println(postfix + player.checkCoins());

            //FIVE PLUMS

        } else if ((reelOne == Fruit.PLUM) && (reelTwo == Fruit.PLUM) && (reelThree == Fruit.PLUM) && (reelFour == Fruit.PLUM) && (reelFive == Fruit.PLUM)) {
            player.coins += Winner.PLUMWINS.getWinnings();
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe);
            System.out.println(line);
            System.out.println(winnerMessage + Winner.PLUMWINS.getWinnings());
            System.out.println(postfix + player.checkCoins());

            //FOUR CHERRIES IN A ROW

        } else if ((reelOne == Fruit.CHERRY) && (reelTwo == Fruit.CHERRY) && (reelThree == Fruit.CHERRY) && (reelFour == Fruit.CHERRY) || (reelTwo == Fruit.CHERRY) && (reelThree == Fruit.CHERRY) && (reelFour == Fruit.CHERRY) && (reelFive == Fruit.CHERRY)) {
            player.coins += Winner.YOUGOTFOURCHERRYINAROW.getWinnings();
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe);
            System.out.println(line);
            System.out.println("Congratulations, you got four Cherries in a row!");
            System.out.println(winnerMessage + Winner.YOUGOTFOURCHERRYINAROW.getWinnings());
            System.out.println(postfix + player.checkCoins());

            //FOUR LEMONS IN A ROW

        } else if ((reelOne == Fruit.LEMON) && (reelTwo == Fruit.LEMON) && (reelThree == Fruit.LEMON) && (reelFour == Fruit.LEMON) || (reelTwo == Fruit.LEMON) && (reelThree == Fruit.LEMON) && (reelFour == Fruit.LEMON) && (reelFive == Fruit.LEMON)) {
            player.coins += Winner.YOUGOTFOURLEMONINAROW.getWinnings();
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe);
            System.out.println(line);
            System.out.println("Congratulations, you got four Lemons in a row!");
            System.out.println(winnerMessage + Winner.YOUGOTFOURLEMONINAROW.getWinnings());
            System.out.println(postfix + player.checkCoins());

            //FOUR PLUMS IN A ROW

        } else if ((reelOne == Fruit.PLUM) && (reelTwo == Fruit.PLUM) && (reelThree == Fruit.PLUM) && (reelFour == Fruit.PLUM) || (reelTwo == Fruit.PLUM) && (reelThree == Fruit.PLUM) && (reelFour == Fruit.PLUM) && (reelFive == Fruit.PLUM)) {
            player.coins += Winner.YOUGOTFOURPLUMINAROW.getWinnings();
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe);
            System.out.println(line);
            System.out.println("Congratulations, you got four Plums in a row!");
            System.out.println(winnerMessage + Winner.YOUGOTFOURPLUMINAROW.getWinnings());
            System.out.println(postfix + player.checkCoins());

            //FOUR CHERRIES

        } else if ((reelOne == Fruit.CHERRY) && (reelTwo == Fruit.CHERRY) && (reelThree == Fruit.CHERRY) && (reelFive == Fruit.CHERRY) || (reelOne == Fruit.CHERRY) && (reelThree == Fruit.CHERRY) && (reelFour == Fruit.CHERRY) && (reelFive == Fruit.CHERRY) || (reelOne == Fruit.CHERRY) && (reelTwo == Fruit.CHERRY) && (reelFour == Fruit.CHERRY) && (reelFive == Fruit.CHERRY)) {
            player.coins += Winner.YOUGOTFOURCHERRY.getWinnings();
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe);
            System.out.println(line);
            System.out.println("Congratulations, you got four Cherries!");
            System.out.println(winnerMessage + Winner.YOUGOTFOURCHERRY.getWinnings());
            System.out.println(postfix + player.checkCoins());

            //FOUR LEMONS

        } else if ((reelOne == Fruit.LEMON) && (reelTwo == Fruit.LEMON) && (reelThree == Fruit.LEMON) && (reelFive == Fruit.LEMON) || (reelOne == Fruit.LEMON) && (reelThree == Fruit.LEMON) && (reelFour == Fruit.LEMON) && (reelFive == Fruit.LEMON) || (reelOne == Fruit.LEMON) && (reelTwo == Fruit.LEMON) && (reelFour == Fruit.LEMON) && (reelFive == Fruit.LEMON)) {
            player.coins += Winner.YOUGOTFOURLEMON.getWinnings();
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe);
            System.out.println(line);
            System.out.println("Congratulations, you got four Lemons!");
            System.out.println(winnerMessage + Winner.YOUGOTFOURLEMON.getWinnings());
            System.out.println(postfix + player.checkCoins());

            //FOUR PLUMS

        } else if ((reelOne == Fruit.PLUM) && (reelTwo == Fruit.PLUM) && (reelThree == Fruit.PLUM) && (reelFive == Fruit.PLUM) || (reelOne == Fruit.PLUM) && (reelThree == Fruit.PLUM) && (reelFour == Fruit.PLUM) && (reelFive == Fruit.PLUM) || (reelOne == Fruit.PLUM) && (reelTwo == Fruit.PLUM) && (reelFour == Fruit.PLUM) && (reelFive == Fruit.PLUM)) {
            player.coins += Winner.YOUGOTFOURPLUM.getWinnings();
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe);
            System.out.println(line);
            System.out.println("Congratulations, you got four Plums!");
            System.out.println(winnerMessage + Winner.YOUGOTFOURPLUM.getWinnings());
            System.out.println(postfix + player.checkCoins());

            //THREE IN A ROW

        } else if ((reelOne) == (reelTwo) && (reelTwo) == (reelThree) && (reelOne) != (reelFive)||
                (reelTwo) == (reelThree) && (reelThree) == (reelFour) && (reelThree) != (reelOne) && (reelThree) != (reelFive)||
                (reelThree) == (reelFour) && (reelFour) == (reelFive) && (reelThree) != (reelOne)) {
            player.coins += Winner.YOUGOTTHREE.getWinnings();
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe);
            System.out.println(line);
            System.out.println("Congratulations, you got Three " + reelThree + "S in a row!");
            System.out.println(winnerMessage + Winner.YOUGOTTHREE.getWinnings());
            System.out.println(postfix + player.checkCoins());

            // LOSE

        } else {
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe + reelFour + pipe + reelFive + pipe);
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
