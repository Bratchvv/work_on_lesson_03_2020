package com.company.lab20.method_generics;

public class Test {

    public static void main(String[] args) {
        // String resultS =  Util.getMiddle("1","2","3","4","5","6","7");  потому что есть ограничение в дженерике
        Integer resultL = Util.getMiddle(1, 2, 3, 4, 5, 6, 7);
        System.out.println(resultL);

        Double middleD = Util.getMiddle(10.0, 5.0, 13.1, 77.7);
    }
}
