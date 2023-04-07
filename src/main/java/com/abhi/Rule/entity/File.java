package com.abhi.Rule.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UploadedFiles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class File {
    @Id
    private  String fileNumber;
    private  String alphabet;
    private  int count;
}
