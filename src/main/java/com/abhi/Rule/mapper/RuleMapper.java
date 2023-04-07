package com.abhi.Rule.mapper;

import com.abhi.Rule.dto.FileDTO;
import com.abhi.Rule.entity.File;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RuleMapper {
    FileDTO convertFileToFileDTO(File file);
}
