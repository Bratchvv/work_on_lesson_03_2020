package com.company.lab19.anonymus_class;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Outer {

    // Анонимный класс, который реализует интерфейс Hello
    static Hello h = new Hello() {
        @Override
        public void show() {
            System.out.println("Метод внутреннего анонимного класса 1");
        }
    };

    static Hello h2 = new Hello() {
        @Override
        public void show() {
            System.out.println("Метод внутреннего анонимного класса 2");
        }
    };

    public static void main(String[] args) {
        h.show();
        h2.show();
    }
}

