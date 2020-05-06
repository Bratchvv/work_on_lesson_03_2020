package com.company.lab19;

import com.company.lab15.abstracts.AbstractDevice;
import com.company.lab15.abstracts.Mobile;
import com.company.lab15.interfaces.EmailSender;

public class PreviewTest {

    private int privateInt;

    public void test() {

        int value = 10; //локальная перемнная

        class MethodClass { //локальный класс (очень редко)

        }

        class EmailSenderImpl implements  EmailSender {
            @Override
            public String editMail(String mail) {
                return null;
            }

            @Override
            public String createMail(String mail) {
                return null;
            }

            @Override
            public void sendMail(String mail) {

            } //локальный класс (очень редко)

        }
        EmailSender localClass = new EmailSenderImpl();

        EmailSender anonimClass = new EmailSender() { //анонимный класс (часто)
            @Override
            public String editMail(String mail) {
                return null;
            }

            @Override
            public String createMail(String mail) {
                return null;
            }

            @Override
            public void sendMail(String mail) {

            }
        };

        AbstractDevice conditioner = new AbstractDevice() {
            @Override
            protected void switchPower() {
                System.out.println("Найти и ткнуть пульт");
            }

            @Override
            protected boolean diagnostic(String algorythm) {
                return false;
            }
        };

        conditioner.updateSoft();
    }

    private class InnerClass { // внутренний класс (очень редко)

        void innerTest() {
            privateInt = 10;
        }

//        static void staticMethod() {
//            System.out.println("Не работает статик");
//        }
    }

    public static class StaticNestedClass { //статичный внутренний класс (средне часто)

        static void staticMethod() {
            System.out.println("ТУТ СТАТИК работает");
        }
    }
}



