package com.company.lab1;

public class Main {

    public static void main(String[] args) {
        int iSize = 300;
        int jSize = 400;
        int[][] arr = new int[iSize][jSize];
        for (int i = 0; i < iSize; i++) {
            for (int j = 0; j < jSize; j++) {
                arr[i][j] = i+j;
            }
        }

        long sum = 0;
        for (int i = 0; i < iSize; i++) {
            for (int j = 0; j < jSize; j++) {
                sum +=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
