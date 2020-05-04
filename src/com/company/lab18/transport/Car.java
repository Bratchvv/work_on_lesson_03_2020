package com.company.lab18.transport;

import java.io.IOException;

public class Car extends Transport {

    @Override
    void drive() throws CarIoException
    {
        System.out.println(" car drive ");
    }

    public static void main(String args[]) {
        Transport car1 = new Car();
        try {
            car1.drive();
        } catch (IOException e) {
            System.out.println(e);
        }

        Car car2 = new Car();
        try {
            car2.drive();
        } catch (CarIoException e) {
            e.printStackTrace();
        }
    }
}
