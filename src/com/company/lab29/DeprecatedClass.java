package com.company.lab29;

@Deprecated
public class DeprecatedClass {

    private String field;

    public String getField() {
        return field;
    }

    @Deprecated
    @SuppressWarnings("All")
    public void setField(String field) {
        this.field = field;
    }
}
