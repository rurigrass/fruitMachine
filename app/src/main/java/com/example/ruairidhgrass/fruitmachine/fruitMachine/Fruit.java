package com.example.ruairidhgrass.fruitmachine.fruitMachine;

public enum Fruit {
    CHERRY("Cherry"),
    LEMON("Lemon"),
    PLUM("Plum");

    private String value;

    private Fruit(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
