package com.company.lab18;

import java.util.Scanner;

public class AssertExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.print("Enter age ");

        int value = scanner.nextInt();
        assert value>=18:" Not valid";

        System.out.println("value is "+value);
    }

}
