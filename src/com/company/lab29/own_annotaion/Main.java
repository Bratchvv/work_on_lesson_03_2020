package com.company.lab29.own_annotaion;

public class Main {
    public static void main(String[] args) {

        Test test = new Test();
        Class testClass = test.getClass();
        About testAbout = (About) testClass.getAnnotation(About.class);

        Service service = new Service();
        Class serviceClass = service.getClass();
        About serviceAbout = (About) serviceClass.getAnnotation(About.class);

        for (int i = 0; i < testAbout.count(); i++) {
            System.out.println("Test info (" + i + "):" + testAbout.info());
        }

        for (int i = 0; i < serviceAbout.count(); i++) {
            System.out.println("Service info (" + i + "):" + serviceAbout.info());
        }
    }
}
