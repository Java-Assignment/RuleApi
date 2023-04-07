package com.abhi.Rule.controller;

import com.abhi.Rule.dto.FileDTO;
import com.abhi.Rule.exception.InvalidInputException;
import com.abhi.Rule.exception.NegativeNumberException;
import com.abhi.Rule.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RuleControllerImpl implements RuleController{
    @Autowired
    private RuleService ruleService;

    @Override
    public ResponseEntity<FileDTO> RuleOne(String fileNumber) throws NegativeNumberException {
        FileDTO fileDTO1=ruleService.CheckForPositivity(fileNumber);
        return new ResponseEntity<>(fileDTO1,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<FileDTO> RuleTwo(String fileNumber) throws InvalidInputException {
        FileDTO fileDTO2=ruleService.CheckForLetters(fileNumber);
        return new ResponseEntity<>(fileDTO2,HttpStatus.OK);
    }
}
