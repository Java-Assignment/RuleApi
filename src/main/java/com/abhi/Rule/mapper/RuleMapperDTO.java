package com.abhi.Rule.mapper;


import com.abhi.Rule.dto.FileDetailsDTO;
import com.abhi.Rule.externalsvc.formularefsvc.dto.FileDataDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RuleMapperDTO {
    FileDetailsDTO convertfileDataDTOToFileDetailsDTO(FileDataDTO fileDataDTO);
}
