package com.example.ruairidhgrass.fruitmachine.fruitMachine;

public enum Fruit {
    CHERRY(30),
    LEMON(20),
    PLUM(10);

    private int value;

    private Fruit(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
