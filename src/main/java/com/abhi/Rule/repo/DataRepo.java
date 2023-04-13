package com.abhi.Rule.repo;

import com.abhi.Rule.entity.Formula;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepo extends MongoRepository<Formula, String> {
    Formula findByFileNumber(String fileNumber);
}
