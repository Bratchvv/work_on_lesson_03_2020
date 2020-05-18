package com.company.lab20.passport;

public class CompareTest {

    public static void main(String[] args) {
            Passport<String> p1 = new Passport<>("1","a");
            Passport<String> p2 = new Passport<>("2","ab");
            Passport<String> p3 = new Passport<>("3","abc");
            Passport<String> p4 = new Passport<>("4","abcd");
            Passport<String> p5 = new Passport<>("5","abcde");

            Passport<String> pEtalon = new Passport<>("11234123341234","aaa");

            Passport<String>[] arr = new Passport[]{p1,p2,p3,p4,p5};

            int res = countGreaterThan(arr, pEtalon);
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray) {
            if (e.compareTo(elem) > 0) {
                ++count;
            }
        }
        return count;
    }

}
