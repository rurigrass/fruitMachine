package com.example.ruairidhgrass.fruitmachine.fruitMachine;

public enum Winner {
    CHERRYWINS(30),
    LEMONWINS(10),
    PLUMWINS(20);

    private int winnings;

    private Winner(int winnings) {
        this.winnings = winnings;
    }

    public int getWinnings() {
        return this.winnings;
    }
}

