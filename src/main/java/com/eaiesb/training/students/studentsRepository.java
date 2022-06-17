package com.eaiesb.training.students;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.eaiesb.training.students.*;

public interface studentsRepository extends MongoRepository <students, String> {

	students findByStudentNumber(String studentNumber);
}
