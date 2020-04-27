package com.company.lab16;

public class CreateString {

    public static void main(String[] args) {
        String str1 = "abc";

        String str2 = new String("abc");

        char data[] = {'a', 'b', 'c'};
        String str3 = new String(data);

        String str4 = new String(str1.getBytes());

        StringBuilder builder = new StringBuilder("abc");
        String str5 = new String(builder);

        System.out.println(str5.length());

        String str6 = "Hello," + " kitty" + "!";
        String str6b = "Hello,".concat(" kitty").concat("!");


        String name = "Василий Пупкин";
        int age = 22;
        Double rating = 86.271;
        String userData = String.format("Имя: %s, возраст: %d, средний балл: %2f%%", name, age, rating);
        System.out.println(userData);
    }
}
