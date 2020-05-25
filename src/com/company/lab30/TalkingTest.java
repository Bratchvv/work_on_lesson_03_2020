package com.company.lab30;

public class TalkingTest {

    public static void main(String[] args) {
        Talking t1 = (s,c) -> {
            for (int i = 0; i < c; i++) {
                System.out.println(s);
            }
        };
        t1.say("Hello Vasya", 100);
    }
}
