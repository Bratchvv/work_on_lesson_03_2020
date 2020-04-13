package com.company.lab5;

import java.util.Arrays;

public class Car {

    private final String model;
    private final String label;
    private String color = "WHITE";
    private boolean isAutomat;
    private double volume;

    public Car(String label, String model, String color) {
        this.label = label;
        this.model = model;
        this.color = color;
    }

    public Car(String model, String label, String color, boolean isAutomat, double volume) {
        this.model = model;
        this.label = label;
        this.color = color;
        this.isAutomat = isAutomat;
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public String getLabel() {
        return label;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAutomat() {
        return isAutomat;
    }

    public void setAutomat(boolean automat) {
        isAutomat = automat;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
