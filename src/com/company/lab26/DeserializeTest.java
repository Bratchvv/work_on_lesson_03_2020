package com.company.lab26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeTest {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat")))
        {
            Object o=ois.readObject(); // приведение к типу, т к по умолчанию Object
            Person p=(Person)o; // приведение к типу, т к по умолчанию Object
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
