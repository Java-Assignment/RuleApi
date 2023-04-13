package com.abhi.Rule.exception;

public class NegativeNumberException extends Exception {
    public NegativeNumberException(String theNumberIsNegative) {
        super(theNumberIsNegative);
    }
}
