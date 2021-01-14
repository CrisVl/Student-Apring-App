package com.student.demorestapi.repository;

import com.student.demorestapi.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {


}
