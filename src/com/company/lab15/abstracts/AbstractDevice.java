package com.company.lab15.abstracts;

public abstract class AbstractDevice {

    private String name;
    private Integer serial;

    protected String getPasport() {
        return name + " #" + serial;
    }

    protected abstract void switchPower();

    protected abstract boolean diagnostic(String algorythm);

    public void updateSoft() {
        switchPower(); // выключаем
        System.out.println("Качаем прошивку");
        System.out.println("Запускаем в режиме обновления");
        System.out.println("Обновляем");
        switchPower(); //включить
        boolean checked = diagnostic("UODATE"); // проверить работу
        if (!checked) {
            System.out.println("Ошибка при обновлениии!!!!!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }
}
