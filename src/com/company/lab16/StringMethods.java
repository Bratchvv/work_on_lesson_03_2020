package com.company.lab16;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String data = " AAbbCcDdEE qq ww 123 ";

        data = data.trim();

        String[] arr = data.split(" ");
        System.out.println(Arrays.toString(arr));

        data = data.toLowerCase();
        data = data.replace('A', 'Z');
        data = data.concat("new word ");
        data = data.substring(2, 5);
        data = data.substring(1).replace("qq"
            , "33").toUpperCase();
        System.out.println(data);
    }

}
