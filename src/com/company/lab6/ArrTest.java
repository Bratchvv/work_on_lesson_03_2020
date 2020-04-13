package com.company.lab6;

import static java.util.Objects.nonNull;
import java.util.Objects;

import java.util.Arrays;

public class ArrTest {

    private String[] arr;
    private int[] chapters;

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public int[] getChapters() {
        return chapters;
    }

    public void setChapters(int[] chapters) {
        this.chapters = chapters;
    }

    public static void main(String[] args) {
        ArrTest t = new ArrTest();
        t.setArr(generateArrayByPages(100));
        System.out.println(Arrays.toString(t.getArr()));
        String[][] result = generateChaptersByPages(t.getArr(), 4);
        System.out.println("done");
    }


    public static String[] generateArrayByPages(int count){
        String[] array = new String[count];
        for (int i = 0; i < count; i++) {
            array[i]= (i+1)+" стр.";
        }
        return array;
    }

    public static String[][] generateChaptersByPages(String[] pages, int chaptersCount){
        if(nonNull(pages)){
            throw new RuntimeException("глав не должно быть меньше чем 1");
        }
        if(chaptersCount <= 0) {
            throw new RuntimeException("глав не должно быть меньше чем 1");
        }
        int size = pages.length/chaptersCount;
        String[][] chapters = new String[chaptersCount][size];
        for (int i = 0; i < size ; i++) {
            for (int j = i; j < size; j++) {
                chapters[i][j] = pages[j+size*i];
            }
        }

        return chapters;
    }
}
