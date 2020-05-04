package com.company.lab18;

public class ClassCastExceptionTest {

    public static void main(String[] args) {
        String str = "asdfasdf";
        Object obj = str;
        // 1
        String str2 = (String)obj; // GOOD

        //2
        if(obj instanceof Integer) { // GOOD
            Integer i = (Integer) obj;
        }

        //3
        Integer i = (Integer) obj; // ClassCastException
    }

}
