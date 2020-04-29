package com.company.lab17;


import static com.company.lab17.KeyboardTypes.MECHANIC;

import com.company.lab2.Keyboard;
import java.sql.SQLOutput;

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

        testSwitch(t1);
        testSwitch(MECHANIC);
        testSwitch(KeyboardTypes.valueOf("SENSOR"));

        System.out.println(KeyboardTypes.WIRELESS.compareTo(KeyboardTypes.WIRED)); //output: 1
        System.out.println(MECHANIC.compareTo(MECHANIC)); //output: 0
        System.out.println(KeyboardTypes.WIRELESS.compareTo(KeyboardTypes.SENSOR)); //output: -2

        System.out.println(Color.BLUE.getAllFormats());

        printRgbColor(Color.GREEN);
        printRgbColor(Color.BLUE);

        Color[] colors = Color.values();
        for (Color color : colors) {
            System.out.println(color.getAllFormats());
        }
        System.out.println();
    }

    static void printRgbColor(Color color){
        System.out.println(color.getRgbCode());
    }

    static void testSwitch(KeyboardTypes typeEnum) {
        switch (typeEnum) {
            case SENSOR:
                System.out.println("1 This is SENSOR");
                break;
            case WIRELESS:
                System.out.println("1 This is WIRELESS");
                break;
            case WIRED:
                System.out.println("1 This is WIRED");
                break;
            case MECHANIC:
                System.out.println("1 This is MECHANIC");
                break;
            default:
                System.out.println("1 Default");
        }

        if(typeEnum.equals(KeyboardTypes.SENSOR)){
            System.out.println("2 This is SENSOR");
        } else if (typeEnum.equals(KeyboardTypes.WIRELESS)) {
            System.out.println("2 This is WIRELESS");
        } else if (typeEnum.equals(KeyboardTypes.WIRED)) {
            System.out.println("2 This is WIRED");
        } else if (typeEnum.equals(MECHANIC)) {
            System.out.println("2 This is MECHANIC");
        } else {
            System.out.println("2 Default");
        }
    }
}
