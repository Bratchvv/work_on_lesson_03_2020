package com.company.lab15.abstracts;

public class Test {

    public static void main(String[] args) {
        AbstractDevice mobile = new Mobile();
        mobile.switchPower();
        mobile.diagnostic("1234325");
        mobile.updateSoft();
        //mobile.runApp("shazam");

        Tv ledTv = new LedTv();
        ledTv.switchPower();
        ledTv.diagnostic("safertewrew");
        ledTv.updateSoft();

        Tv eltTv = new EltTv();
        eltTv.switchPower();
        eltTv.diagnostic("q34534");
        eltTv.updateSoft();
    }

}
