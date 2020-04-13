package com.company.lab4;


import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        System.out.println(" a = " + a + " и b = " + b); // a=3, b=4
        testMethod(a, b);
        System.out.println("a = " + a + " и b = " + b); // a=3, b= 4

       // printSum(0,0);
       // printSumSquare(2,3);

//        System.out.println("Hello");
//
//        hello();
//        int methodResult = sum(2, 5);
//        print(methodResult);
//
        Order newOrder = createOrder();
        printOrder(newOrder);
//
//        printOrder(createOrder());
    }

    public static void testMethod(int a, int b) {
        a = a + 10;
        b = a;
        System.out.println("a = " + a + " и b = " + b); // a=13, b= 13
    }


    public static Order createOrder() {
        Order myOrder = new Order();
        myOrder.setIndex(1);
        myOrder.setOwner("Vasya");
        myOrder.setPhone("066-852-52-63");
        myOrder.setAddress("zp");
        myOrder.setDiscount(false);
        myOrder.setItems(new String[]{"Микроволку", "Антисептик", "Маски, 2 шт"});
        myOrder.setCost(1200);
        return myOrder;
    }

    public static void printOrder(final Order order) {
        System.out.println(order.getIndex());
        System.out.println(order.getOwner());
        System.out.println(order.getPhone());
        System.out.println(order.getAddress());
        System.out.println(order.isDiscount());
        System.out.println(Arrays.toString(order.getItems()));
        System.out.println(order.getCost() + Order.currency);
    }

    public static void print(int value) {
        System.out.println(value);
    }

    public static void hello() {
        System.out.println("Hello");
    }

    public static int sum(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("Both 0");
            return 0;
        } else {
            int result = a + b;
            System.out.println(a + "+" + b + "=" + result);
            return result;
        }
    }

    public static void printSumSquare(int aa, int bb) {//2,3
        if (aa == 0 && bb == 0) {
            System.out.println("Both 0");
            return;
        }
        int r = sum(aa,bb) * sum(bb,aa);
        System.out.println(r);
    }
}
