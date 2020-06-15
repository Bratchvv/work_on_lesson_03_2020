package com.company.lab26;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ExternalizableTest {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ext_person.dat")))
        {
            ExternalizablePerson p = new ExternalizablePerson("Tolik", "qwerty", 1);
            oos.writeObject(p);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
