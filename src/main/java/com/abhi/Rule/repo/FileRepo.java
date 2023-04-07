package com.abhi.Rule.repo;

import com.abhi.Rule.entity.File;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepo extends MongoRepository<File, String> {
    File findByFileNumber(String fileNumber);
}
