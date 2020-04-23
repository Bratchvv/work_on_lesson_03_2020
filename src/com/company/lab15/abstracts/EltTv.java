package com.company.lab15.abstracts;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class EltTv extends Tv {

    private int zSize;

    @Override
    protected boolean diagnostic(String algorythm) {
        System.out.println("Проверить тестером!");
        return false;
    }

    @Override
    protected String getPasport() {
        return "TV serial:" + super.getPasport();
    }

    @Override
    public void updateSoft() {
        throw new NotImplementedException();
    }

    public int getzSize() {
        return zSize;
    }

    public void setzSize(int zSize) {
        this.zSize = zSize;
    }
}
