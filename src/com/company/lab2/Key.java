package com.company.lab2;

public class Key {

    private String symbolEn;
    private String symbolRu;
    private String type;

    public Key(String symbolEn, String symbolRu, String type) {
        this.symbolEn = symbolEn;
        this.symbolRu = symbolRu;
        this.type = type;
    }

    public void pressMe() {
        System.out.println(symbolRu + " was pressed!");
    }

    public String getSymbolEn() {
        return symbolEn;
    }

    public String getSymbolRu() {
        return symbolRu;
    }

    public String getType() {
        return type;
    }
}
