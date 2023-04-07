package com.abhi.Rule.service;

import com.abhi.Rule.dto.FileDTO;
import com.abhi.Rule.exception.InvalidInputException;
import com.abhi.Rule.exception.NegativeNumberException;
import com.abhi.Rule.mapper.RuleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RuleServiceImpl implements RuleService {
    @Autowired
    private RuleMapper ruleMapper;

    @Override
    public String CheckForPositivity(FileDTO fileDTO) throws NegativeNumberException {
        if (fileDTO.getCount() > 0) {
            return "The count of the number is positive";
        } else {
            throw new NegativeNumberException("The number is negative");
        }
    }

    @Override
    public String CheckForLetters(FileDTO fileDTO) throws InvalidInputException {
        boolean result;
        result = fileDTO.getAlphabet().chars().allMatch(Character::isLetter);
        if (result) {
            return "The alphabet consist of only alphabets";
        } else {
            throw new InvalidInputException("The alphabet contains input other than alphabets ");
        }
    }
}
