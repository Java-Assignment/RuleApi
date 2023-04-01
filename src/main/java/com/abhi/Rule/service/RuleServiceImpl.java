package com.abhi.Rule.service;

import com.abhi.Rule.dto.FileDetailsDTO;
import com.abhi.Rule.exception.FileIdNotFoundException;
import com.abhi.Rule.externalsvc.formularefsvc.FormulaRefDataService;
import com.abhi.Rule.externalsvc.formularefsvc.dto.FileDataDTO;
import com.abhi.Rule.mapper.RuleMapperDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RuleServiceImpl implements RuleService{
    @Autowired
    private FormulaRefDataService formulaRefDataService;
    @Autowired
    private RuleMapperDTO ruleMapperDTO;
    @Override
    public FileDetailsDTO addRule(String fileNumber) throws FileIdNotFoundException {

        FileDataDTO fileDataDTO=formulaRefDataService.getByFileNumber(fileNumber);
        if(fileDataDTO.getCount()>0){
            FileDetailsDTO fileDetailsDTO=ruleMapperDTO.convertfileDataDTOToFileDetailsDTO(fileDataDTO);
            return fileDetailsDTO;
        }
        else{
            throw  new FileIdNotFoundException("the  count value is not positive for file "+fileNumber);
        }
    }
}
