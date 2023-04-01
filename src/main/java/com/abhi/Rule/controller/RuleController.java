package com.abhi.Rule.controller;

import com.abhi.Rule.dto.FileDetailsDTO;
import com.abhi.Rule.exception.FileIdNotFoundException;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/rule",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
@Validated

public interface RuleController {
    @GetMapping("/{fileNumber}")
    @Operation(summary = "add rules")
    ResponseEntity<FileDetailsDTO>addRule(@PathVariable("fileNumber") @NotNull String fileNumber) throws FileIdNotFoundException;
}
