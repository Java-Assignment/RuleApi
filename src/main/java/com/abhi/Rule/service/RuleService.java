package com.abhi.Rule.service;

import com.abhi.Rule.dto.DataDTO;
import com.abhi.Rule.exception.NegativeNumberException;
import com.abhi.Rule.exception.NegativePerimeterException;

public interface RuleService {

    DataDTO CheckForPositivityOfFileNumber(String fileNumber) throws NegativeNumberException;

    DataDTO CheckForPositivityOfPerimeter(String fileNumber) throws NegativePerimeterException;
}
