package com.company.lab30;

public class AfterLambdaApp {

    public static int minus(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Operationable op1 = AfterLambdaApp::minus;
        Operationable op2 = (x, y) -> x + y;
        int z1 = op1.calculate(20, 10);
        int z2 = op2.calculate(20, 10);
        System.out.println(z1); // 30
        System.out.println(z2); // 30
    }
}

