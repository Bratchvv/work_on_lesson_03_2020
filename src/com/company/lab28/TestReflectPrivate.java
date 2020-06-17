package com.company.lab28;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflectPrivate {
    public static void main(String[] args) throws IllegalAccessException,
            ClassNotFoundException,
            InstantiationException,
            NoSuchMethodException,
            InvocationTargetException {
        Class c2 = Class.forName("com.company.lab28.OtherPrivate");
        Object obj = c2.newInstance();
        OtherPrivate other = (OtherPrivate) obj;
        final Method setMethod = other.getClass().getDeclaredMethod("setI", Integer.class );
        setMethod.setAccessible(true);
        setMethod.invoke(other, 99);
        final Method getMethod = other.getClass().getDeclaredMethod("getI");
        getMethod.setAccessible(true);
        final Object result = getMethod.invoke(other);
        System.out.println(result);
    }
}
