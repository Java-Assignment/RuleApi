package com.abhi.Rule.service;

import com.abhi.Rule.dto.FileDTO;
import com.abhi.Rule.exception.InvalidInputException;
import com.abhi.Rule.exception.NegativeNumberException;

public interface RuleService {

    FileDTO CheckForPositivity(String fileNumber) throws NegativeNumberException;

    FileDTO CheckForLetters(String fileNumber) throws InvalidInputException;
}
