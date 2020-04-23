package com.company.lab15.abstracts;

public class LedTv extends Tv {

    private String resolution;
    private boolean isSmart;

    @Override
    protected boolean diagnostic(String algorythm) {
        System.out.println("Подключить к стенду диагностики");
        return false;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }
}
