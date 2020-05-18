package com.company.lab20.passport;

public class Test {

    public static void main(String[] args) {
        // 1. ========================================================================
        Passport<String> p1 = new Passport<String>("СЮ12345", "Иванов");
        String p1Serial = p1.getSerial ();
        System.out.println(p1);
        Passport<Integer> p2 = new Passport<Integer>(232345, "Студент");
        Integer p2Serial = p2.getSerial();
        System.out.println(p2Serial);
        Passport<Long> p3 = new Passport<Long>(123454667L, "Иванов");
        // ==========================================================================


        // 2. ========================================================================
        InternationalPassport<String> ip = new InternationalPassport<>("asdfas", "Kolya");
        // ==========================================================================


        // 3. ========================================================================
        InternationalPassport<Integer> inPassport = new InternationalPassport(10, "asdf");
        Passport<Integer> passport = inPassport;
        System.out.println(passport.getSerial());
        //Passport<String> passport2 =  inPassport; // ERROR
        // ==========================================================================


        Passport<Integer> p11 = new Passport<>(123,"ss");
        Passport<Number> p12 = new Passport<>(123,"ss");
        Passport<Double> p13 = new Passport<>(123.0,"ss");
        // p11 = p12; // ERROR
        wildcardTest(p11);
        wildcardTest(p12);
        wildcardTest(p13);
        wildcardTest(inPassport);
        //wildcardTest(p1);
    }

    public static void wildcardTest(Passport<? extends Number> p) {
        System.out.println(p.getSerial().intValue() + 10);
    }
}
