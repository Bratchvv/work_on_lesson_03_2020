package com.company.lab20.passport_interface;

public interface Passportable<T> {
    T getSerial();
    String getOwner();
}
