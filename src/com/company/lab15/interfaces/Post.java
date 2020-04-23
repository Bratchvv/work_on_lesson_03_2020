package com.company.lab15.interfaces;

public class Post implements MailSender {

    @Override
    public String createMail(String mail) {
        return "Manual write mail:" + mail;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("Manual send: " + mail);
    }
}
