package com.example.ruairidhgrass.fruitmachine.fruitMachine;

public enum Fruit {
    BAR(50),
    CHERRY(30),
    PLUM(20),
    LEMON(10);

    private int value;

    private Fruit(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
