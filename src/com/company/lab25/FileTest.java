package com.company.lab25;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileTest {

    public static void main(String[] args) {
        File f1 = new File("src/com/company");
        if(!f1.exists()) {
            try {
                f1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            if(f1.isFile()) {
                System.out.println(f1.getName());
            } else if(f1.isDirectory()) {
                System.out.println(Arrays.toString(f1.list()));
            }
        }
    }
}
