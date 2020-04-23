package com.company.lab15.interfaces;

import com.company.lab15.abstracts.AbstractDevice;

public class Laptop extends AbstractDevice implements EmailSender {

    @Override
    protected void switchPower() {
        System.out.printf("нажать кнопку вкл выкл");
    }

    @Override
    protected boolean diagnostic(String algorythm) {
        System.out.println("Безопасн режим виндавс");
        return false;
    }

    @Override
    public String editMail(String mail) {
        return "(PC) fixed:" + mail;
    }

    @Override
    public String createMail(String mail) {
        return "(PC) new mail:" + mail;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("(PC) Email send: " + mail);
    }
}
