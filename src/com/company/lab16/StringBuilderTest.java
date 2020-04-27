package com.company.lab16;

public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("finish-");
        builder.append("first_");
        builder.append(1);
        builder.append('_');
        builder.append('c');
        String result = builder.toString();
        System.out.println(result);

        StringBuilder builder2 = new StringBuilder("finish-")
            .append("first-")
            .append(1)
            .append('-')
            .append('c')
            .append('-')
            .append(2)
            .append('-')
            .append(true)
            .reverse();
        String result2 = builder2.toString();
        System.out.println(result2);

        int testSize = 200_000;
        long startTime = System.currentTimeMillis();
        String s = "a";
        for (int i = 0; i < testSize; i++) {
            s = s + "a";
        }
        System.out.println("Concat time: " + (System.currentTimeMillis() - startTime));


        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < testSize; i++) {
            sb.append("a");
        }
        s = sb.toString();
        System.out.println("Builder time: " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("a");
        for (int i = 0; i < testSize; i++) {
            sbf.append("a");
        }
        s = sbf.toString();
        System.out.println("Buffer time: " + (System.currentTimeMillis() - startTime));

        String s2 = "a";
    }
}
