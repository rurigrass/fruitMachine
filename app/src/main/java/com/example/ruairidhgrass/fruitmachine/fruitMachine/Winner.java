package com.example.ruairidhgrass.fruitmachine.fruitMachine;

public enum Winner {
    BARWINS(1000),
    CHERRYWINS(100),
    PLUMWINS(75),
    LEMONWINS(50),
    YOUGOTFOURBARINAROW(40),
    YOUGOTFOURCHERRYINAROW(30),
    YOUGOTFOURPLUMINAROW(25),
    YOUGOTFOURLEMONINAROW(20),
    YOUGOTFOURCHERRY(15),
    YOUGOTFOURPLUM(10),
    YOUGOTFOURLEMON(5),
    YOUGOTTHREE(3),
    YOUGOTONEBAR(5),

    YANGWINS(20),
    POUNDWINS(15),
    DOLLARWINS(10),
    EUROWINS(5);


    private int winnings;

    private Winner(int winnings) {
        this.winnings = winnings;
    }

    public int getWinnings() {
        return this.winnings;
    }
}

