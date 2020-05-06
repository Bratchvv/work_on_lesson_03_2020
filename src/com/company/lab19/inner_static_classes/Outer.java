package com.company.lab19.inner_static_classes;

import java.util.HashMap;
import java.util.Map;

public class Outer {

    // Статический внутренний класс
    static class Inner {
        public void innerTest() {
            System.out.println("Inner method");
        }

        public static void innerStaticTest() {
            System.out.println("Inner static method");
        }
    }

    // Можно, но на практике используется крайне редко
    class ChildInnerClass extends Inner {

        @Override
        public void innerTest() {
            super.innerTest();
        }
    }

    public static void main(String[] args) {
        Outer.Inner.innerStaticTest();

        Outer.Inner inner = new Outer.Inner();
        inner.innerTest();
    }

}
