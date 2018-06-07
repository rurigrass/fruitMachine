package com.example.ruairidhgrass.fruitmachine.fruitMachine;

import java.util.Random;

public class YangMachine {

    private Yang reelOne;
    private Yang reelTwo;
    private Yang reelThree;

    private String prefix;
    private String line;
    private String pipe;
    private String winnerMessage;
    private String losingMessage;
    private String postfix;
    private int coins;

    Player player;

    public YangMachine(int coins) {
        this.coins = coins;
        this.prefix = "@@ CODECLAN FRUIT MACHINE @@";
        this.line = "=================================";
        this.pipe = "<|>";
        this.winnerMessage = "Congratulations, you have won £";
        this.losingMessage = "No wins, try again, ";
        this.postfix = "Your remaining credit is £";
        this.player = new Player(20);

    }

    public Yang getRandomYang() {
        Yang[] yangs = {Yang.¥, Yang.£, Yang.$, Yang.€};
        Random rand = new Random();
        int index = rand.nextInt(yangs.length);
        return yangs[index];
    }

    public void setReelOne() {
        this.reelOne = getRandomYang();
    }

    public void setReelTwo() {
        this.reelTwo = getRandomYang();
    }

    public void setReelThree() {
        this.reelThree = getRandomYang();
    }


    public void spin() {
        this.setReelOne();
        this.setReelTwo();
        this.setReelThree();
    }

    public Yang getReelOne() {
        return reelOne;
    }

    public Yang getReelTwo() {
        return reelTwo;
    }

    public Yang getReelThree() {
        return reelThree;
    }

    public String play() {

        Yang reelOne = getReelOne();
        Yang reelTwo = getReelTwo();
        Yang reelThree = getReelThree();

        player.coins -= 1;

        System.out.println(prefix);
        System.out.println(line);

        if ((reelOne == Yang.¥) && (reelTwo == Yang.¥) && (reelThree == Yang.¥)) {
            player.coins += Winner.CHERRYWINS.getWinnings();
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
            System.out.println(line);
            System.out.println(winnerMessage + Winner.CHERRYWINS.getWinnings());
            System.out.println(postfix + player.checkCoins());

        } else if ((reelOne == Yang.£) && (reelTwo == Yang.£) && (reelThree == Yang.£)) {
            player.coins += Winner.LEMONWINS.getWinnings();
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
            System.out.println(line);
            System.out.println(winnerMessage + Winner.LEMONWINS.getWinnings());
            System.out.println(postfix + player.checkCoins());

        } else if ((reelOne == Yang.$) && (reelTwo == Yang.$) && (reelThree == Yang.$)) {
            player.coins += Winner.PLUMWINS.getWinnings();
            System.out.println(pipe + reelOne + pipe + reelTwo + pipe + reelThree + pipe);
            System.out.println(line);
            System.out.println(winnerMessage + Winner.PLUMWINS.getWinnings());
            System.out.println(postfix + player.checkCoins());

        } else if ((reelOne == Yang.€) && (reelTwo == Yang.€) && (reelThree == Yang.€)) {
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

    }

}

