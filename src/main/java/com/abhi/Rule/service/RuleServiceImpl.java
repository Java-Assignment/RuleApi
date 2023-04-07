package com.abhi.Rule.service;

import com.abhi.Rule.dto.FileDTO;
import com.abhi.Rule.entity.File;
import com.abhi.Rule.exception.InvalidInputException;
import com.abhi.Rule.exception.NegativeNumberException;
import com.abhi.Rule.mapper.RuleMapper;
import com.abhi.Rule.repo.FileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RuleServiceImpl implements RuleService {
    @Autowired
    private FileRepo fileRepo;
    @Autowired
    private RuleMapper ruleMapper;

    @Override
    public FileDTO CheckForPositivity(String fileNumber) throws NegativeNumberException {
        File file = fileRepo.findByFileNumber(fileNumber);
        if (file != null && file.getCount() > 0) {
            FileDTO fileDTO = ruleMapper.convertFileToFileDTO(file);
            return fileDTO;
        } else {
            throw new NegativeNumberException("The number is negative");
        }
    }

    @Override
    public FileDTO CheckForLetters(String fileNumber) throws InvalidInputException {
        boolean result;
        File file = fileRepo.findByFileNumber(fileNumber);
        result = file.getAlphabet().chars().allMatch(Character::isLetter);
        if (file != null && result) {
            FileDTO fileDTO = ruleMapper.convertFileToFileDTO(file);
            return fileDTO;
        } else {
            throw new InvalidInputException("The alphabet contains input other than alphabets ");
        }
    }
}
