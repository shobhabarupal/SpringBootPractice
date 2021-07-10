package com.db.SpringBoot.SpringBootPractice.Service;

import com.db.SpringBoot.SpringBootPractice.Model.Student;
import com.db.SpringBoot.SpringBootPractice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();

    }

    public void delete(int id) {
        studentRepository.deleteById(id);
    }

    public void saveOrUpdate(Student student) {
        studentRepository.save(student);
    }
}
