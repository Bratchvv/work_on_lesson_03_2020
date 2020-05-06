package com.company.lab19.local_classes;

public class Outer {

    void outerMethod() {
        int value = 77;
        System.out.println("Метод внешнего класса");
        class LocalInner {
            public void innerMethod() {
                System.out.println(" value = " + value);
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.innerMethod();
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
    }

}