package com.company.lab6;

import static com.company.lab6.Data.*;
import static com.company.lab6.Counter.*;

public class Main {

    public static void main(String[] args) {

        Data.test();
        Counter.test();
        myStatic += 10;
        System.out.println(myStatic);

        Data data1 = new Data();
        data1.notStatic +=5;
        System.out.println("Статическая переменная = " + myStatic); // 20
        System.out.println("Не статическая переменная = " + data1.notStatic); // 5

        Data data2 = new Data();
        System.out.println("Новая статическая переменная = " + myStatic); // 20
        System.out.println("Новая не статическая переменная = " + data2.notStatic); //
    }

}
