package com.company.lab18;

import com.company.lab18.exception.BadResultException;
import com.company.lab18.exception.MaximumValueException;
import com.company.lab18.exception.NegativeValueException;

public class ThrowExample {

    static void procedure(int i) throws NegativeValueException, BadResultException {
        System.out.println(" inside procedure");
        if(i < 0) {
            throw new NegativeValueException("Поддерживаются только числа > 0");
        }
        if(i > 100) {
            throw new MaximumValueException("Поддерживаются только числа > 100");
        }
        int result = i * 2;
        if(result > 100) {
            throw new BadResultException("Результат не должен быть > 100");
        }
        System.out.println("Success procedure");
    }

    static void globalProcess(int i) throws BadResultException {
        try {
            procedure(i);
        } catch (NegativeValueException e) {
            System.out.println("Обработка исключения внутри globalProcess," + e.getMessage());
        } finally {
            System.out.println("globalProcess finally");
        }
    }

    static void test(int i ) {
        try {
            globalProcess(i);
        }  catch (MaximumValueException e) {
            System.out.println("Ошибка расчета внутри main," + e.getMessage());
        } catch (BadResultException e) {
            System.out.println("Ошибка оезультата," + e.getMessage());
        } catch (Exception e) {
            System.out.println("Общая ошибка внутри main," + e.getMessage());
        } finally {
            System.out.println("test finally");
        }
    }
    public static void main(String args[]) {
        try {
            System.out.println("============================================");
            test(10);
            System.out.println("============================================");
            test(-1);
            System.out.println("============================================");
            test(105);
            System.out.println("============================================");
            test(60);
            System.out.println("============================================");
            test(20);
            System.out.println("============================================");
        } finally {
            System.out.println("main finally");
        }
        System.out.println("Continue....");
    }

}
