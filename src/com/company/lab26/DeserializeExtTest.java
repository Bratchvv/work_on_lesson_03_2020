package com.company.lab26;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeExtTest {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ext_person.dat")))
        {
            Object o=ois.readObject(); // приведение к типу, т к по умолчанию Object
            ExternalizablePerson p=(ExternalizablePerson)o; // приведение к типу, т к по умолчанию Object
            System.out.printf("Name: %s \t Role: %d  \t Pass: %s\n",
                    p.getUserName(), p.getRoll(), p.getPassWord());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
