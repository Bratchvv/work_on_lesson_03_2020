package com.company.lab17;

enum Color {

    RED("#FF0000", "(255,0,0)"),
    BLUE("#0000FF", "(0,0,255)"),
    GREEN("#00FF00", "(0,255,0)");

    private String code;
    private String rgbCode;

    Color(String code, String rgbCode) {
        this.code = code;
        this.rgbCode = rgbCode;
    }

    public String getCode() {
        return code;
    }

    public String getRgbCode() {
        return rgbCode;
    }

    public String getAllFormats() {
        return code + ", " + rgbCode;
    }
}
