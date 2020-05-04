package com.company.lab18.transport;

import java.io.IOException;

public class CarIoException extends IOException {

    public CarIoException() {
        super();
    }

    public CarIoException(String message) {
        super(message);
    }
}
