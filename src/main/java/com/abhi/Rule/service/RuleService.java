package com.abhi.Rule.service;

import com.abhi.Rule.dto.FileDTO;
import com.abhi.Rule.exception.InvalidInputException;
import com.abhi.Rule.exception.NegativeNumberException;

public interface RuleService {

    String CheckForPositivity(FileDTO fileDTO) throws NegativeNumberException;

    String CheckForLetters(FileDTO fileDTO) throws InvalidInputException;
}
