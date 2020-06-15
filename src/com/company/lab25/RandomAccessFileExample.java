package com.company.lab25;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {
        try {
            String filePath = "notes3.txt";
            System.out.println(new String(readCharsFromFile(filePath, 1, 5)));
            writeData(filePath, "Data", 5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeData(String filePath, String data, int seek) throws IOException {
        // открываем файл с возможностью как чтения, так и записи
        try(RandomAccessFile file = new RandomAccessFile(filePath, "rw")) {
            // переходим на определенный индекс
            file.seek(seek);
            // запишем данные в этом месте
            file.write(data.getBytes());
        }
    }

    private static byte[] readCharsFromFile(String filePath, int seek, int chars) throws IOException {
        // открываем файл только для чтения
        try(RandomAccessFile file = new RandomAccessFile(filePath, "r")) {
            file.seek(seek);
            byte[] bytes = new byte[chars];
            file.read(bytes);
            return bytes;
        }
    }

}
