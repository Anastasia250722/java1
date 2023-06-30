package org.example.class5.exception;

public class CustomException extends Exception{

    public CustomException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public CustomException(String message) {
        super(message);
    }
}
