package com.abhi.Rule.service;

import com.abhi.Rule.dto.DataDTO;
import com.abhi.Rule.entity.Formula;
import com.abhi.Rule.exception.NegativeNumberException;
import com.abhi.Rule.exception.NegativePerimeterException;
import com.abhi.Rule.mapper.RuleMapper;
import com.abhi.Rule.repo.DataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RuleServiceImpl implements RuleService {
    @Autowired
    private DataRepo dataRepo;
    @Autowired
    private RuleMapper ruleMapper;

    @Override
    public DataDTO CheckForPositivityOfFileNumber(String fileNumber) throws NegativeNumberException {
        Formula formula = dataRepo.findByFileNumber(fileNumber);
        int FileNumber = Integer.parseInt(formula.getFileNumber());
        if (formula != null && FileNumber > 0) {
            DataDTO dataDTO = ruleMapper.convertFormulaToDataDTO(formula);
            return dataDTO;
        } else {
            throw new NegativeNumberException("The number is negative");
        }
    }

    @Override
    public DataDTO CheckForPositivityOfPerimeter(String fileNumber) throws NegativePerimeterException {
        Formula formula = dataRepo.findByFileNumber(fileNumber);
        if (formula != null && formula.getPerimeter() > 0) {
            DataDTO dataDTO = ruleMapper.convertFormulaToDataDTO(formula);
            return dataDTO;
        } else {
            throw new NegativePerimeterException("The perimeter is negative");
        }
    }


}
