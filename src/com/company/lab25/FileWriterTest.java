package com.company.lab25;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        // append со значением false - то есть файл будет перезаписываться.
        try(FileWriter writer = new FileWriter("notes3.txt", true))
        {
            // запись всей строки
            String text = "Hello World!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
