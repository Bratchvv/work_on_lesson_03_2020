package com.company.lab2;

public class Test {

    public static void main(String[] args) {

        String m = "Logitech HZ";
        Key[] keys = new Key[102];
        for (int i = 0; i < keys.length; i++) {
            keys[i] = new Key("btn_en_"+i,"btn_ru_"+i, "literal");
        }

        Keyboard k1 = new Keyboard(m, 102, keys, new ScrollPad());

        ScrollPad sc = k1.getScrollPad();
        Key[] k1Keys = k1.getKeys();
        k1.printWord("test word");
        System.out.println();
    }
}
