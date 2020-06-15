package com.company.lab25;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamTest {

    public static void main(String[] args) {
        try(PrintStream printStream = new PrintStream("notes3.txt"))
        {
            printStream.print("Hello World!");
            printStream.println("Welcome to Java!");
            printStream.printf("Name: %s Age: %d \n", "Ivan", 25);
            String message = "PrintStream";
            byte[] messageToBytes = message.getBytes();
            printStream.write(messageToBytes);
            System.out.println("The file has been written");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
