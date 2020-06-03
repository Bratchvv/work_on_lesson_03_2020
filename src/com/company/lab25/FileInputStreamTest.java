package com.company.lab25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest {

    public static void main(String[] args) {
        try(FileInputStream fin=new FileInputStream("./src/com/company/lab2/Keyboard.java"))//C://test//text.txt
        {
            System.out.printf("File size: %d bytes \n", fin.available());
            int i=-1;
            // считываем каждый отдельный байт в переменную i
            //Когда в потоке больше нет данных для чтения, метод возвращает число -1.
            while((i=fin.read())!=-1){
                // считанный байт конвертируется в объект типа char и выводится на консоль
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finaly!!!!");
        }
    }


}
