package com.sparta.alex.exceptions;

public class InvalidInputException extends Exception{
    public InvalidInputException(String errorMessage) {
        super(errorMessage);
    }
}
