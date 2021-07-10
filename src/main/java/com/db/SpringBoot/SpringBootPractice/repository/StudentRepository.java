package com.db.SpringBoot.SpringBootPractice.repository;

import com.db.SpringBoot.SpringBootPractice.Model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
