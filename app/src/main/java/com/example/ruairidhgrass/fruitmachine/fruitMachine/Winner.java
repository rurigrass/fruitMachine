package com.example.ruairidhgrass.fruitmachine.fruitMachine;

public enum Winner {
    CHERRYWINS(30),
    PLUMWINS(20),
    LEMONWINS(10);

    private int winnings;

    private Winner(int winnings) {
        this.winnings = winnings;
    }

    public int getWinnings() {
        return this.winnings;
    }
}

