package com.company.lab15.interfaces;

import com.company.lab15.abstracts.AbstractDevice;

public class SmartPhone extends AbstractDevice implements Caller, EmailSender {

    @Override
    protected void switchPower() {
        System.out.println("держим кнопку вкл/вкл");
    }

    @Override
    protected boolean diagnostic(String algorythm) {
        System.out.println("test");
        return false;
    }

    @Override
    public void call(String contact) {
        System.out.println("Открыаем контакты и звоним: " + contact);
    }

    @Override
    public String editMail(String mail) {
        return "fixed:" + mail;
    }

    @Override
    public String createMail(String mail) {
        return "new mail:" + mail;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("Email send: " + mail);
    }
}
