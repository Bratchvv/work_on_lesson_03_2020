package com.company.lab6;

public class Block {

   static int counter = 0;

    public Block() {
        counter++;
        System.out.println("Вызван конструктор " + counter);
    }

    public void printStatic() {
        counter += 10;
        System.out.println("Print:" + counter);
    }
}
