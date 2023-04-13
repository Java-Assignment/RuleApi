package com.abhi.Rule.controller;

import com.abhi.Rule.dto.DataDTO;
import com.abhi.Rule.exception.NegativeNumberException;
import com.abhi.Rule.exception.NegativePerimeterException;
import com.abhi.Rule.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RuleControllerImpl implements RuleController {
    @Autowired
    private RuleService ruleService;

    @Override
    public ResponseEntity<DataDTO> RuleOne(String fileNumber) throws NegativeNumberException {
        DataDTO dataDTO1 = ruleService.CheckForPositivityOfFileNumber(fileNumber);
        return new ResponseEntity<>(dataDTO1, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<DataDTO> RuleTwo(String fileNumber) throws NegativePerimeterException {
        DataDTO dataDTO2 = ruleService.CheckForPositivityOfPerimeter(fileNumber);
        return new ResponseEntity<>(dataDTO2, HttpStatus.OK);
    }
}
