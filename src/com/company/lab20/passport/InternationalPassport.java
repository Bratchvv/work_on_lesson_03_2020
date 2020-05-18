package com.company.lab20.passport;

public class InternationalPassport<T> extends Passport<T> {

    T copySerial;

    InternationalPassport(T serial, String owner) {
        super(serial, owner);
    }

    public T getCopySerial() {
        return copySerial;
    }

    public void setCopySerial(T copySerial) {
        this.copySerial = copySerial;
    }
}
