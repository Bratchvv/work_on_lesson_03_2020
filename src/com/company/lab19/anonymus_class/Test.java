package com.company.lab19.anonymus_class;

public class Test {

    public static void main(String[] args) {
        System.out.println("Обычное использование");
        Demo demo1 = new Demo();
        demo1.show();

        // Анонимный класс наследуется от класса Demo
        System.out.println("\nИспользование анонима");
        Demo demo2 = new Demo() {
            @Override
            public void show() {
                super.show();
                System.out.println("Метод внутреннего анонимного класса");
            }
        };
        demo2.show();

        System.out.println("\nПовтор обычного использования");
        Demo demo3 = new Demo();
        demo3.show();
    }
}
