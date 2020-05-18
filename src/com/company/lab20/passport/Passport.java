package com.company.lab20.passport;

class Passport<T> implements Comparable<Passport> {

    private T serial;
    private String owner;

    Passport(T serial, String owner) {
        this.serial = serial;
        this.owner = owner;
    }

    public T getSerial() {
        return serial;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Passport{" +
            "serial=" + serial +
            ", owner='" + owner + '\'' +
            '}';
    }

    @Override
    public int compareTo(Passport o) {
        return this.owner.compareTo(o.owner);
    }
}