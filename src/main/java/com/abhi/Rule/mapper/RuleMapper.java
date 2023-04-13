package com.abhi.Rule.mapper;

import com.abhi.Rule.dto.DataDTO;
import com.abhi.Rule.entity.Formula;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RuleMapper {
    DataDTO convertFormulaToDataDTO(Formula formula);
}
