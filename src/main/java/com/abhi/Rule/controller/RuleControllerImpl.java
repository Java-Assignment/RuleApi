package com.abhi.Rule.controller;

import com.abhi.Rule.dto.FileDetailsDTO;
import com.abhi.Rule.exception.FileIdNotFoundException;
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
    public ResponseEntity<FileDetailsDTO> addRule(String fileNumber) throws FileIdNotFoundException {
        FileDetailsDTO fileDetailsDTO=ruleService.addRule(fileNumber);
        return new ResponseEntity<>(fileDetailsDTO, HttpStatus.OK);
    }
}
