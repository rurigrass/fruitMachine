//package com.example.ruairidhgrass.fruitmachine.fruitMachine;
//
//import java.util.Random;
//
//public class Machine5 {
//
//    private Fruit reelOne;
//    private Fruit reelTwo;
//    private Fruit reelThree;
//
//    private String prefix;
//    private String line;
//    private String pipe;
//    private String winnerMessage;
//    private String losingMessage;
//    private String postfix;
//    private int coins;
//
//    Player player;
//
//    public Machine(int coins) {
//        this.coins = coins;
//        this.prefix = "@@ CODECLAN FRUIT MACHINE @@";
//        this.line = "=================================";
//        this.pipe = "<|>";
//        this.winnerMessage = "Congratulations, you have won £";
//        this.losingMessage = "No wins, try again, ";
//        this.postfix = "Your remaining credit is £";
//        this.player = new Player(20);
//
////        this.outcome = this.spin();
//    }
//
//    public Fruit getRandomFruit() {
//        Fruit[] fruits = {Fruit.CHERRY, Fruit.LEMON, Fruit.PLUM};
//        Random rand = new Random();
//        int index = rand.nextInt(fruits.length);
//        return fruits[index];
//    }
//
//    public void setReelOne() {
//        this.reelOne = getRandomFruit();
//    }
//
//    public void setReelTwo() {
//        this.reelTwo = getRandomFruit();
//    }
//
//    public void setReelThree() {
//        this.reelThree = getRandomFruit();
//    }
//
//
//    public void spin() {
//        this.setReelOne();
//        this.setReelTwo();
//        this.setReelThree();
//    }
//
//    public Fruit getReelOne() {
//        return reelOne;
//    }
//
//    public Fruit getReelTwo() {
//        return reelTwo;
//    }
//
//    public Fruit getReelThree() {
//        return reelThree;
//    }
//
//    public String play() {
//
//        Fruit reelOne = getReelOne();
//        Fruit reelTwo = getReelTwo();
//        Fruit reelThree = getReelThree();
//
//        player.coins -= 1;
//
//        System.out.println(prefix);
//        System.out.println(line);
//
//        if ((reelOne == Fruit.CHERRY) && (reelTwo == Fruit.CHERRY) && (reelThree == Fruit.CHERRY)) {
//            player.coins += Winner.CHERRYWINS.getWinnings();
//            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
//            System.out.println(line);
//            System.out.println(winnerMessage + Winner.CHERRYWINS.getWinnings());
//            System.out.println(postfix + player.checkCoins());
//
//        } else if ((reelOne == Fruit.LEMON) && (reelTwo == Fruit.LEMON) && (reelThree == Fruit.LEMON)) {
//            player.coins += Winner.LEMONWINS.getWinnings();
//            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
//            System.out.println(line);
//            System.out.println(winnerMessage + Winner.LEMONWINS.getWinnings());
//            System.out.println(postfix + player.checkCoins());
//
//        } else if ((reelOne == Fruit.PLUM) && (reelTwo == Fruit.PLUM) && (reelThree == Fruit.PLUM)) {
//            player.coins += Winner.PLUMWINS.getWinnings();
//            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
//            System.out.println(line);
//            System.out.println(winnerMessage + Winner.PLUMWINS.getWinnings());
//            System.out.println(postfix + player.checkCoins());
//
//        } else {
//            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
//            System.out.println(line);
//            System.out.println(losingMessage);
//            System.out.println(postfix + player.checkCoins());
//            return losingMessage;
//        }
//        return losingMessage;
//    }
//
//}
