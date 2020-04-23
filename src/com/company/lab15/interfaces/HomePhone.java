package com.company.lab15.interfaces;

public class HomePhone implements Caller {

    @Override
    public void call(String contact) {
        System.out.println("Press buttons");
        System.out.println("Call my mom!");
    }

    @Override
    public void sos() {
        System.out.println("Call 02");
    }
}
