package com.abhi.Rule.controller;

import com.abhi.Rule.dto.DataDTO;
import com.abhi.Rule.exception.NegativeNumberException;
import com.abhi.Rule.exception.NegativePerimeterException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/rule", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
@Validated
@Tag(name = "Rule Api", description = "The app contains rules for the files")
public interface RuleController {
    @GetMapping(value = {"/ruleOne/{fileNumber}"})
    @Operation(summary = "rule one check")
    ResponseEntity<DataDTO> RuleOne(@PathVariable String fileNumber) throws NegativeNumberException;

    @GetMapping(value = "/ruleTwo/{fileNumber}")
    @Operation(summary = "rule two  check")
    ResponseEntity<DataDTO> RuleTwo(@PathVariable String fileNumber) throws  NegativePerimeterException;
}
