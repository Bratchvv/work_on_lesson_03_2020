package com.company.lab17;

public class CalculatorEnum {

    private enum Calculator {
        SUM {
            public int action(int x, int y) {
                return x + y;
            }
        },
        SUBTRACT {
            public int action(int x, int y) {
                return x - y;
            }
        },
        MULTIPLY {
            public int action(int x, int y) {
                return x * y;
            }
        };

        public abstract int action(int x, int y);
    }

    public static void main(String[] args) {
        Calculator op = Calculator.SUM;
        System.out.println(op.action(10, 5)); // 15
        op = Calculator.MULTIPLY;
        System.out.println(op.action(6, 6)); // 36
    }
}

