package com.company.lab25;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        String text = "Hello world!"; // строка для записи
        // Для автоматического закрытия файла и освобождения ресурса объект FileOutputStream
        // создается с помощью конструктции try...catch.
        try (FileOutputStream fos = new FileOutputStream("test")) { //"C://test//text.txt"
            // перевод строки в байты
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }

}
