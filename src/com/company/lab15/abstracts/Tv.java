package com.company.lab15.abstracts;

public abstract class Tv extends AbstractDevice {

    private int inchSize;

    @Override
    protected void switchPower() {
        System.out.println("Нажать кнопку на пульте");
    }

    public int getInchSize() {
        return inchSize;
    }

    public void setInchSize(int inchSize) {
        this.inchSize = inchSize;
    }

}
