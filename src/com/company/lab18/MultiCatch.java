package com.company.lab18;

public class MultiCatch {

    public static void main(String args[]) {
        try {
            test();
        } catch (Exception e) {
            System.out.println("Some Error: " + e);
        }
        System.out.println("MAIN END");

    }

    private static void test() {
        System.out.println("START");
        double result = 0;
        try {
            System.out.println("IN TRY");
            int a = 10;
            int b = 10 - 10;

            System.out.println("CREATE ARR");
            int[] arr = {1, 2, 3};
            System.out.println("CREATED ARR");

            System.out.println("BEFORE OUT OF BOUNDS ");
            arr[500] = 123; // ArrayIndexOutOfBoundsException
            System.out.println("AFTER OUT OF BOUNDS ");

            System.out.println("BEFORE / 0 ");
            result = a / b;
            System.out.println("AFTER / 0 ");
        } catch (ArithmeticException e) {
            System.out.println("IN CATCH ");
            System.out.println("div by 0: " + e.toString());
            result = 100;
        }

        System.out.println("FINISH," + result);
    }
}
