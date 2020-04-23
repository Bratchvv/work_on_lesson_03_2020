package com.company.lab15.abstracts;

public class Mobile extends AbstractDevice {

    private String os;
    private int ram;

    @Override
    protected void switchPower() {
        System.out.println("Для вкл. зажать кнопку");
    }

    @Override
    protected boolean diagnostic(String algorythm) {
        System.out.println("Проверяем прошивку");
        return false;
    }

    public void runApp(String name) {
        System.out.println("run");
    }
}
