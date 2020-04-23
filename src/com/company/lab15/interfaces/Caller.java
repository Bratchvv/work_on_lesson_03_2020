package com.company.lab15.interfaces;

public interface Caller {

    void call(String contact);

    default void sos() {
        System.out.println("Call 911");
    }

}
