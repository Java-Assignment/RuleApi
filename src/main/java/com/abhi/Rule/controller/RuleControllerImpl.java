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
    public ResponseEntity<String> RuleOne(FileDTO fileDTO) throws NegativeNumberException {
        String message=ruleService.CheckForPositivity(fileDTO);
        return new ResponseEntity<>(message,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> RuleTwo(FileDTO fileDTO) throws InvalidInputException {
        String message=ruleService.CheckForLetters(fileDTO);
        return new ResponseEntity<>(message,HttpStatus.OK);
    }
}
