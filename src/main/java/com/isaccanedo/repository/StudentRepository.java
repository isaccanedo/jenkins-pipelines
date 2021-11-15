package com.isaccanedo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.isaccanedo.domain.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
}
