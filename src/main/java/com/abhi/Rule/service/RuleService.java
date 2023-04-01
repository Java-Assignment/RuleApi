package com.abhi.Rule.service;

import com.abhi.Rule.dto.FileDetailsDTO;
import com.abhi.Rule.exception.FileIdNotFoundException;

public interface RuleService {
    FileDetailsDTO addRule(String fileNumber) throws FileIdNotFoundException;
}
