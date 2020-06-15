package com.company.lab26;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeTest {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat")))
        {
            Person p = new Person("Tolik", 35);
            oos.writeObject(p);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
