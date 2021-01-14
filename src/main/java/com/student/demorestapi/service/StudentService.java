package com.student.demorestapi.service;

import java.util.Optional;

import com.student.demorestapi.model.Student;

public interface StudentService {

	public Iterable<Student> findAll();

	public Student save(Student student);

	public Optional<Student> findByID(String id);

	public void removeStudent(String id);

}
