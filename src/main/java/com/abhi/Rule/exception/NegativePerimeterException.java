package com.abhi.Rule.exception;

public class NegativePerimeterException extends Exception {
    public NegativePerimeterException(String thePerimeterIsNegative) {
        super(thePerimeterIsNegative);
    }
}
