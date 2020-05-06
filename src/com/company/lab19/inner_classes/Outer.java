package com.company.lab19.inner_classes;

public class Outer {

    // Простой вложенный класс
    class Inner {
        public void innerTest() {
            System.out.println("Inner method");
        }
    }

    public static void main(String[] args) {
        // 1
        Outer.Inner inner = new Outer().new Inner();
        inner.innerTest();

        // 2
        Outer outer = new Outer();
        Inner inner2 = outer.new Inner();
        inner2.innerTest();
    }

}
