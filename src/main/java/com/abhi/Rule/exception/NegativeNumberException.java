package com.abhi.Rule.exception;

public class NegativeNumberException extends Throwable {
    public NegativeNumberException(String theNumberIsNegative) {
        super(theNumberIsNegative);
    }
}
