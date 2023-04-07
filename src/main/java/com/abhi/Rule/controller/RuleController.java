package com.abhi.Rule.controller;

import com.abhi.Rule.dto.FileDTO;
import com.abhi.Rule.exception.InvalidInputException;
import com.abhi.Rule.exception.NegativeNumberException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/rule",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
@Validated
@Tag(name="Rule Api",description = "The app contains rules for the files")
public interface RuleController {
    @PostMapping
    @Operation(summary = "add rule one")
    ResponseEntity<String>RuleOne(@RequestBody @Valid FileDTO fileDTO) throws  NegativeNumberException;

    @PostMapping
    @Operation(summary = "add rule two")
    ResponseEntity<String>RuleTwo(@RequestBody @Valid FileDTO fileDTO) throws InvalidInputException;
}
