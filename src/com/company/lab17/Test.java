package com.company.lab17;

public class Test {

    public static void main(String[] args) {

        for (KeyboardTypes kt: KeyboardTypes.values()){
            System.out.println("KeyboardType: " + kt.name());
        }

        KeyboardTypes t1 = KeyboardTypes.WIRED;
        KeyboardTypes t2 = KeyboardTypes.valueOf("WIRED");
        boolean r1 = t1.equals(t2);
        boolean r2 = t1 == t2;
        System.out.println("r1="+r1);
        System.out.println("r2="+r2);
    }
}
