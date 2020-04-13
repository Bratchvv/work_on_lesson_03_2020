package com.company.lab2;

public class Keyboard {

    private String model = "one"; //1
    private int buttonsCount = 123;
    private Key[] keys = new Key[102];
    private ScrollPad scrollPad;

    public Keyboard() {
    }

    public Keyboard(String model, int buttonsCount, Key[] keys, ScrollPad scrollPad) {
        this.model = model;
        this.buttonsCount = buttonsCount;
        this.keys = keys;
        this.scrollPad = scrollPad;
    }

    public void printWord(String word) {
        for (Key k : keys) {
            k.pressMe();
        }
        System.out.println("Print:" + word + ", on " + model);
    }

    public String getModel() {
        return model;
    }

    public int getButtonsCount() {
        return buttonsCount;
    }

    public Key[] getKeys() {
        return keys;
    }

    public ScrollPad getScrollPad() {
        return scrollPad;
    }
}



