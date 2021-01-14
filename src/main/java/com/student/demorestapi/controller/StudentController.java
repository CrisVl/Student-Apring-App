package com.student.demorestapi.controller;

import com.student.demorestapi.model.Student;
import com.student.demorestapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Student> student() {
        return studentRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Student create(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Optional<Student> read(@PathVariable String id) {
        return studentRepository.findById(id);
    }

}
