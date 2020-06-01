package com.company.lab24;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() { }

    public static LazySingleton getInstance() { // #3
        if (instance == null) {        //если объект еще не создан
            instance = new LazySingleton();    //создать новый объект
        }
        return instance;        // вернуть ранее созданный объект
    }
}
