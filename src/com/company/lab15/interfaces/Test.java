package com.company.lab15.interfaces;

import com.company.lab15.abstracts.AbstractDevice;

public class Test {

    public static void main(String[] args) {
        MailSender post = new Post();
        String postMail = post.createMail("POST MAIL TEXT");
        post.sendMail(postMail);

        EmailSender laptop = new Laptop();
        String laptopMail = laptop.createMail("LAPTOP MAIL TEXT");
        laptopMail = laptop.editMail(laptopMail);
        laptop.sendMail(laptopMail);

        SmartPhone smartPhone = new SmartPhone();

        // Upcasting (неявное)
        AbstractDevice ad = smartPhone;
        Caller caller = smartPhone;
        EmailSender eSender = smartPhone;

        ((SmartPhone) caller).switchPower(); // Downcating (явное)

        smartPhone.switchPower();
        String smartPhoneMail = smartPhone.createMail("SMARTPHONE MAIL TEXT");
        smartPhoneMail = smartPhone.editMail(smartPhoneMail);
        smartPhone.sendMail(smartPhoneMail);
        smartPhone.call("Ivan");

        smartPhone.sos();


        HomePhone hm = new HomePhone();
        hm.sos();
    }
}
