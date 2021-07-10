package com.db.SpringBoot.SpringBootPractice.Controller;

import com.db.SpringBoot.SpringBootPractice.Model.Student;
import com.db.SpringBoot.SpringBootPractice.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(value = "/student/{id}")
    private Student getStudent(@PathVariable("id") int id)
    {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/student/{id}")
    private void deleteStudent(@PathVariable("id") int id)
    {
        studentService.delete(id);
    }

    @PostMapping("/student")
    private int saveStudent(@RequestBody Student student)
    {
        studentService.saveOrUpdate(student);
        return student.getId();
    }


}
