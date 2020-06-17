package com.company.lab28;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflect {
    public static void main(String[] args) throws IllegalAccessException,
            ClassNotFoundException,
            InstantiationException,
            NoSuchMethodException,
            InvocationTargetException {
        Class c2 = Class.forName("com.company.lab28.Other");
        Object obj = c2.newInstance();
        Other other = (Other) obj;
        final Method setMethod = other.getClass().getMethod("setI", Integer.class );
        setMethod.invoke(other, 99);
        final Method getMethod = other.getClass().getMethod("getI");
        final Object result = getMethod.invoke(other);
        System.out.println(result);
    }
}
