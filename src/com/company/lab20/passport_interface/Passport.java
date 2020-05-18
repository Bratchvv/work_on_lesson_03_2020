package com.company.lab20.passport_interface;

/**
 * Это JavaDoc....
 */
public class Passport implements Passportable<String> {

    private String serial;
    private String owner;

    Passport(String serial, String owner){
        this.serial = serial;
        this.owner = owner;
    }

    @Override
    public String getSerial() {
        return this.serial;
    }

    @Override
    public String getOwner() {
        return this.owner;
    }
}
