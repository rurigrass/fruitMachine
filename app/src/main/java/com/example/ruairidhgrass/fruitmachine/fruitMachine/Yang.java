package com.example.ruairidhgrass.fruitmachine.fruitMachine;

public enum Yang {

    ¥(5),
    £(3),
    $(2),
    €(1);

    private int value;

    private Yang(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
